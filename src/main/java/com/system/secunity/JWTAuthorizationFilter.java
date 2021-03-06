package com.system.secunity;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * 登录成功后的token验证
 * @author Ablett_Chen
 *
 */
@Component
public class JWTAuthorizationFilter extends OncePerRequestFilter {
	
	  @Autowired
	  RedisTemplate redisTemplate;
	  
	  @Autowired
	  private UserDetailsService userDetailsService;

	  /**
	   * token filter.
	   *
	   * @param request     .
	   * @param response    .
	   * @param filterChain .
	   */
	  @Override
	  protected void doFilterInternal(
	      HttpServletRequest request,
	      HttpServletResponse response,
	      FilterChain filterChain) throws ServletException, IOException {
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
	      
	      //用户token存在未过期时重新授权
	      if (authToken != null && redisTemplate.hasKey(authToken)) {
	        String username = redisTemplate.opsForValue().get(authToken).toString();
	        redisTemplate.expire(authToken,JwtUtils.EXPIRITION,TimeUnit.SECONDS);
	        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
	          UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
	          //可以校验token和username是否有效，目前由于token对应username存在redis，都以默认都是有效的
	          UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
	              userDetails, null, userDetails.getAuthorities());
	          authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(
	              request));
	          SecurityContextHolder.getContext().setAuthentication(authentication);
	        }
	      }
	    }

	    filterChain.doFilter(request, response);
}
	  }