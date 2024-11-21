package com.example.security_demo.filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

//Filter is an Interface
@Slf4j
@Component
public class HeadersLoggingFilter implements Filter {

    //Mannually creating instance of Logger
   // private static final Logger log = LoggerFactory.getLogger(HeadersLoggingFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest=(HttpServletRequest) request;
        //httpServletRequest.getHeaderNames()   here we don't Enumeration so converting it into list
        //getHeaderNames() is getting header names and getHeader() is getting value of headerName passed

        Collections.list(httpRequest.getHeaderNames())
                        .forEach(headerNames->{
                            log.info("Header: {}={}",headerNames,httpRequest.getHeader(headerNames));
                                });

        System.out.println("Before Filter....PreProcessing");
        chain.doFilter(request,response);
        System.out.println("After Servlet execution...PostProcessing");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
