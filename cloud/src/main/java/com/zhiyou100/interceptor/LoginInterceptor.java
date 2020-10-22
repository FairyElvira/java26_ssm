package com.zhiyou100.interceptor;

import com.zhiyou100.exception.LoginException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: java26_ssm
 * @description: 创建拦截器实现实现接口：HandlerInterceptor
 * @author: 作者
 * @create: 2020-10-16 17:33
 */

//注意HandlerInterceptor接口中的三个方法 都是default 不会提示实现
//需要ctrl+enter实现方法preHandle
public class LoginInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断session中是否有user
        if(request.getSession().getAttribute("user")==null){
            //没有登陆：抛出异常
            throw new LoginException("必须登陆才能访问！");
        }
        return true;
    }
}
