package com.example.security_demo.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoggingExample {


    @RequestMapping("/log1")
    public String log1()
    {

        //Logging
        log.error("ERROR");  //by default enabled
        log.warn("WARN");    //by default enabled
        log.info("INFO");    //by default enabled
        log.debug("DEBUG");
        log.trace("TRACE");



        return "hello, Log 1 from spring boot";

    }
}
