package com.zhiyou100.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: java26_ssm
 * @description: 创建一个拦截器实现HandlerInterceptor
 * @author: 作者
 * @create: 2020-10-19 23:12
 */
public class InterceptorTest01 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器执行了00000：：：：拦截的请求："+request.getServletPath());
        return true;
    }
}
