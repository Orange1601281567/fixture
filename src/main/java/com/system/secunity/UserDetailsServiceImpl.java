package com.system.secunity;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.system.model.SysUsers;
import com.system.service.ISysUsersService;

/**
 * 自定义的认证用户获取服务类
 * @author Ablett_Chen
 *
 */
@Component("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Resource
    public ISysUsersService iSysUsersService;
	
    /**
     * 根据用户名获取认证用户信息
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(StringUtils.isEmpty(username)) {
            throw new UsernameNotFoundException("UserDetailsService没有接收到用户账号");
        } else {
            /**
             * 根据用户名查找用户信息
             */
        	
        	SysUsers sysUser =new SysUsers();
        	QueryWrapper<SysUsers> queryWrapper=new QueryWrapper<SysUsers>();
        	queryWrapper.eq("username", username);
        	sysUser = iSysUsersService.getOne(queryWrapper);
            if(sysUser == null) {
                throw new UsernameNotFoundException(String.format("用户'%s'不存在", username));
            }
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority(sysUser.getPower()));
          
            /**
             * 创建一个用于认证的用户对象并返回，包括：用户名，密码，角色
             */
            return new User(sysUser.getUsername(), sysUser.getPassword(), grantedAuthorities);
        }
    }
}