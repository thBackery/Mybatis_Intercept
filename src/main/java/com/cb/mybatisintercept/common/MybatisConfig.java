package com.cb.mybatisintercept.common;


import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return configuration -> {
            //插件拦截链采用了责任链模式，执行顺序和加入连接链的顺序有关

            // 先执行
            MyMybatisLogIntercept myPlugin = new MyMybatisLogIntercept();
            configuration.addInterceptor(myPlugin);

            // 第2个执行
            MyMybatisSqlUpdateIntercept myMybatisSqlUpdateIntercept = new MyMybatisSqlUpdateIntercept();
            configuration.addInterceptor(myMybatisSqlUpdateIntercept);
        };
    }

}
