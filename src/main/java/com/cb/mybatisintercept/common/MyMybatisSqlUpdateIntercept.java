package com.cb.mybatisintercept.common;

import com.mysql.cj.xdevapi.SqlStatement;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;


@Intercepts({
        @Signature(
                // 这3个参数  可以确定拦截某一个具体的方法
                type = Executor.class, // 拦截的地方 4 个 :1.Executor  2、ParamterHandler 3、StatementHandler 4、ResultSetHandler
                method = "query",  //  上面类中的方法
                // 方法的参数的类对象
                args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
        )
})
public class MyMybatisSqlUpdateIntercept implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {


        return invocation.proceed();
    }

    class MySqlSource implements  SqlSource{

        @Override
        public BoundSql getBoundSql(Object parameterObject) {
            return null;
        }
    }

}
