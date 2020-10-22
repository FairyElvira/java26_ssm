package com.zhiyou100.configer;

import com.zhiyou100.interceptor.InterceptorTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @program: java26_ssm
 * @description: 为拦截器创建一个配置类
 * @author: 作者
 * @create: 2020-10-19 23:13
 */

@Configuration
public class InterceptorConfiger2 extends WebMvcConfigurationSupport {

    @Autowired
    private InterceptorTest02 interceptorTest02;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptorTest02).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
