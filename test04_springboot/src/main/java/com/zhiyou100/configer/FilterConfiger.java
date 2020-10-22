package com.zhiyou100.configer;

import com.zhiyou100.filter.FilterTest01;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: java26_ssm
 * @description: 2.创建一个配置类 用于注册所有的过滤器
 * @author: 作者
 * @create: 2020-10-19 23:08
 */
@Configuration
public class FilterConfiger {

    @Bean
    public FilterRegistrationBean registFilterTest01(){
        FilterRegistrationBean rb=new FilterRegistrationBean();
        rb.setFilter(new FilterTest01());
        rb.addUrlPatterns("/*");
        rb.setName("test_filter1");
        rb.setOrder(1);
        return rb;
    }
}
