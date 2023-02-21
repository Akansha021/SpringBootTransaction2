package com.example.springboottransaction2.filter;


import com.example.springboottransaction2.controller.PersonController;
import com.example.springboottransaction2.dto.AddressDto;
import com.example.springboottransaction2.dto.PersonDto;
import com.example.springboottransaction2.dto.ProductDto;
import com.example.springboottransaction2.services.DemoService;
import com.google.gson.Gson;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Enumeration;

@Component
@Order(1)
public class PersonFilter implements Filter {
    @Autowired
    DemoService demoService;

    Logger logger= LoggerFactory.getLogger(PersonFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        logger.info("{Person.class} + Inside Do filter ");
        logger.info("Request Id: "+servletRequest.getRequestId());
        logger.info("Request Server Name: "+ servletRequest.getServerName());
        logger.info("Request Content Type: "+servletRequest.getContentType());
        logger.info("Request Protocol: "+servletRequest.getProtocol());


        //demoService.myDemo(); Calling method of service from filter

        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;

        String header=httpServletRequest.getHeader("auth");

        /*

        Practice

        if(header.equals(null)){
            ((HttpServletResponse) servletResponse).setStatus(500);

        }

        ProductDto product = new Gson().fromJson(servletRequest.getReader(), ProductDto.class);
        servletResponse.setContentType("application/json");
        product.setName("Pen");

        // response
        boolean valid = false;
        if (!valid) {
            ((HttpServletResponse) servletResponse).setStatus(422);
            servletResponse.getOutputStream().write("Validation error".getBytes());
            return;
        }
*/

/*
          Setting ProductDto

          PersonDto personDto=new PersonDto();
          AddressDto addressDto=new AddressDto();
          personDto.setId(1);
          personDto.setName("ABC");
          addressDto.setId(1);
          addressDto.setName("DEFG");
          personDto.setAddress(addressDto);
          System.out.println(personDto.getName());

 */
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
