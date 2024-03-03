package com.cb.mybatisintercept;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.cb.mybatisintercept.biz.mapper")
@ComponentScan(basePackages = {"com.cb.mybatisintercept.biz", "com.cb.mybatisintercept.common"
            ,"com.cb.mybatisintercept.filter_interceptor"})
@SpringBootApplication
public class MybatisinterceptApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisinterceptApplication.class, args);
    }

}
