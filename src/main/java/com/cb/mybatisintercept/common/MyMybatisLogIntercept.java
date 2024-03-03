package com.cb.mybatisintercept.common;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Date;

/**
 *  场景  日志监控
 */
@Intercepts({
        @Signature(
                type = Executor.class,
                method = "query",
                args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
        )
})
public class MyMybatisLogIntercept implements Interceptor {
    public Object intercept(Invocation invocation) throws Throwable {

        System.out.println("query before " + new Date());
        Object result = invocation.proceed();
        System.out.println("query after " + new Date());

        return result;
    }
}
