package com.wisely.highlight_springmvc4.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by lyh on 17-5-23.
 */
public class DemoInterceptor extends HandlerInterceptorAdapter{//实现自定义拦截器


    @Override
    public boolean preHandle(HttpServletRequest request,//preHandle方法，在请求发生前执行
                             HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime",startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,//重写postHandle，在请求完成后执行
                           Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间，"+ new Long(endTime - startTime) +"ms");
        request.setAttribute("handllingTime",endTime - startTime);
    }
}
