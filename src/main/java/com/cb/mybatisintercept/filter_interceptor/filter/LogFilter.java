package com.cb.mybatisintercept.filter_interceptor.filter;


import jakarta.servlet.*;

import java.io.IOException;

public class LogFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("1、 log  do filter ......");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
