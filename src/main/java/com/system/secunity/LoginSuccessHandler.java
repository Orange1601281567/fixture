package com.system.secunity;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.system.model.ReturnT;
import com.system.model.SysUsers;
import com.system.service.ISysUsersService;

/**
 * 登錄成功處理類
 * @author Ablett_Chen
 *
 */

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Resource
    public ISysUsersService iSysUsersService;
	
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
    	User getauth=(User)(authentication.getPrincipal());
        String token =JwtUtils.createToken(getauth.getUsername(),getauth.getAuthorities().toString());
        redisTemplate.opsForValue().set(token, getauth.getUsername(),JwtUtils.EXPIRITION,TimeUnit.SECONDS);
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("role", JwtUtils.getRole(token));
        paramMap.put("token", JwtUtils.TOKEN_PREFIX +token);
        
        SysUsers sysUser =new SysUsers();
    	QueryWrapper<SysUsers> queryWrapper=new QueryWrapper<SysUsers>();
    	queryWrapper.eq("username", getauth.getUsername());
    	sysUser = iSysUsersService.getOne(queryWrapper);
        String model=request.getParameter("model");
        //登录成功返回
        ReturnT<Map<String, Object>> ret=new ReturnT<Map<String, Object>>(null);
        if(sysUser.getModel().contains(model)) {
        	ret.setCode(200);
            ret.setData(paramMap);
        }
        else {
            ret.setCode(500);
        	ret.setMsg("您沒有該機種的權限！");
        }
        //设置返回请求头
        response.setContentType("application/json;charset=utf-8");
        //写出流
        PrintWriter out = response.getWriter();
        out.write(JSONObject.toJSONString(ret));
        out.flush();
        out.close();
    }
    
}