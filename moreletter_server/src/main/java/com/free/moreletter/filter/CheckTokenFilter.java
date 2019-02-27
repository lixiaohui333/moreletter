package com.free.moreletter.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

// 注入spring容器
@Component
// 定义filterName 和过滤的url
@WebFilter(filterName = "checkTokenFilter" ,urlPatterns = "/*")
public class CheckTokenFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("filter2");
//
//        servletResponse.getWriter().println("error");
//        HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper((HttpServletResponse) servletResponse);
//        wrapper.sendError(300,"my error:" +servletRequest.get);
        filterChain.doFilter(servletRequest, servletResponse);

    }
    @Override
    public void destroy() {

    }
}
