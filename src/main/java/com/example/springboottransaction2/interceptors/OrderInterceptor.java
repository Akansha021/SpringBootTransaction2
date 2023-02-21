package com.example.springboottransaction2.interceptors;

import com.sun.net.httpserver.Headers;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.ContentCachingRequestWrapper;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.logging.Handler;

public class OrderInterceptor implements HandlerInterceptor {

    Logger logger= LoggerFactory.getLogger(PersonInterceptor.class);
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpServletRequest httpServletRequest=(HttpServletRequest) request;

        String a=httpServletRequest.getParameter("auth");
        System.out.println(a);
        request.setAttribute("auth",1564);

        logger.info("Request Id Interceptor: "+request.getRequestId());

        System.out.println(handler.getClass().getName());

        if(handler!=null){
            if(handler instanceof HandlerMethod){
                HandlerMethod handlerMethod=(HandlerMethod) handler;
                System.out.println("Bean Name: "+handlerMethod.getBean().getClass().getName());
                System.out.println("Method Name: "+handlerMethod.getMethod().getName());
                MethodParameter parameter[]=handlerMethod.getMethodParameters();
                for(MethodParameter methodParameter:parameter){
                    System.out.println("Method Parameter Name: "+ methodParameter);
                }
            }
        }


        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        request.getAttribute("auth");

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception {

    }
}
