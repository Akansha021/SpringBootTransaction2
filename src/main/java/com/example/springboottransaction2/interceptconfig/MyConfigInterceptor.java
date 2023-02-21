package com.example.springboottransaction2.interceptconfig;

import com.example.springboottransaction2.interceptors.OrderInterceptor;
import com.example.springboottransaction2.interceptors.PersonInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class MyConfigInterceptor implements WebMvcConfigurer {
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new OrderInterceptor());
    }
}
