package com.cb.mybatisintercept.filter_interceptor.config;


import com.cb.mybatisintercept.filter_interceptor.interceptor.LogInterceptor;
import com.cb.mybatisintercept.filter_interceptor.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {


        // 1、需要精确的url配置  或着不配置
        // 2、顺序安装添加的顺序
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user/list");

        registry.addInterceptor(new LogInterceptor());

    }

}
