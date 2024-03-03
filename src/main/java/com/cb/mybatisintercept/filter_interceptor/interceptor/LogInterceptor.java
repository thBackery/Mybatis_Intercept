package com.cb.mybatisintercept.filter_interceptor.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogInterceptor implements HandlerInterceptor {


    /**
     *   Filter  在 Interceptor 之前执行
     *
        返回false则该方法执行完，直接结束， 不继续往下执行
        返回true， 继续执行下一个 Interceptor或controller方法

        多个 interceptor 按照配置顺序先后进入这个方法

     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("a log : log deal ");
        return true;
    }


    /**
     *   请求处理完成，  返回视图渲染 在ServletDispatch对modelAndView 处理之前  进入该方法
     *
     *   多个Interceptor 配置在先的 后进入这个方法
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("b  log deal modelAndView");
    }


    /**
     * 多个Interceptor 配置在先的 后进入这个方法
     *
     *   请求流程之后， 进入该方法，
     *   1、进行一些资源释放
     *
     *   2、 计算 那些接口 用时超长
     *   使用ThreadLocal 在preHandler 方法中 保存 刚进入拦截接口的 时间 t1
     *   在这个方法中取出  ，进入该方法时间 t2    t2-t1>临界值  ---> 报警 记录
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("c log release resources .");
    }
}
