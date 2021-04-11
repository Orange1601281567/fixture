package com.system.secunity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Component;
@Component
public class MyLogoutHandler implements LogoutHandler{
	@Autowired
	RedisTemplate redisTemplate;
	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
		String authHeader = request.getHeader(JwtUtils.TOKEN_HEADER);
	    String  urlToekn = request.getParameter("token");
	    if (urlToekn != null || (authHeader != null && authHeader.startsWith(JwtUtils.TOKEN_PREFIX))) {
	      
	      //从请求头或者请求参数中获取token
	      String authToken = "";
	      if(authHeader != null) {
	    	  authToken = authHeader.substring(JwtUtils.TOKEN_PREFIX.length()); // The part after "Bearer "
	      }
	      if((authToken==null || authToken.equals("")) && urlToekn != null) {
	    	  authToken = urlToekn.substring(JwtUtils.TOKEN_PREFIX.length());
	      }
	      redisTemplate.delete(authToken);
	    }
	}

}
