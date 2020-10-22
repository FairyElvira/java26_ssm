package com.zhiyou100.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @program: java26_ssm
 * @description: 过滤器使用2:在过滤器类上添加注解即可
 * @author: 作者
 * @create: 2020-10-19 23:09
 */
@Component
@WebFilter(urlPatterns = "/*", filterName = "test_filter2")
public class FilterTest02 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterTest02222执行了：：：拦截器到请求："+((HttpServletRequest)servletRequest).getServletPath());
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
