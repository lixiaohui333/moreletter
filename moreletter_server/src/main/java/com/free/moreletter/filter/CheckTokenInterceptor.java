package com.free.moreletter.filter;

import com.free.moreletter.domain.BaseException;
import com.free.moreletter.exception.TokenErrorException;
import com.free.moreletter.util.AssertUtil;
import com.free.moreletter.util.TextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class CheckTokenInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        System.out.println("preHandle:"+new Date());
        String uri = httpServletRequest.getRequestURI();
        if(uri.startsWith("/uncheck/")){
            return true;
        }

        String token = httpServletRequest.getHeader("token");
        if(TextUtils.isEmpty(token)){
            throw new TokenErrorException();
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle:"+new Date());
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion:"+new Date());
    }
}
