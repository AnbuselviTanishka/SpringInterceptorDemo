package com.spring.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HelloWorldInterceptor  implements HandlerInterceptor {
	 public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
	        System.out.println("pre-handle");
	        return true;
	    }
	   
	   
	    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, ModelAndView modelAndView)
	            throws Exception {
	        System.out.println("post-handle");
	       
	    }
	   
	    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception exception)
	            throws Exception {
	        System.out.println("after-completion");
	       
	    }
}
