package com.zhiyou100.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @program: java26_ssm
 * @description: 过滤器使用1
 * 1.创建一个类实现filter接口 实现doFilter方法
 * @author: 作者
 * @create: 2020-10-19 23:06
 */
public class FilterTest01 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterTest01执行了：：：拦截器到请求："+((HttpServletRequest)servletRequest).getServletPath());
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
