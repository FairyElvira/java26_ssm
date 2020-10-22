package com.zhiyou100.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-20 10:29
 */

@Component
public class InterceptorTest02 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器执行了222222：：：：拦截的请求："+request.getServletPath());
        return true;
    }
}
