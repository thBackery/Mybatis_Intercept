package com.cb.mybatisintercept.filter_interceptor.config;


import com.cb.mybatisintercept.filter_interceptor.filter.LogFilter;
import com.cb.mybatisintercept.filter_interceptor.filter.LoginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<LogFilter> logFilter(){
        FilterRegistrationBean<LogFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new LogFilter());// 加入管理
        bean.setOrder(1); // 多个 Filter时， 执行顺序
        bean.addUrlPatterns("/mybatis/user/list"); //具体的URL 路径，  要么就不配置
        return bean;
    }

    @Bean
    public FilterRegistrationBean<LoginFilter> loginFilter(){
        FilterRegistrationBean<LoginFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new LoginFilter());
        bean.setOrder(2);
        bean.addUrlPatterns("/mybatis/user/list");
        return bean;
    }

}
