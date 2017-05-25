package com.wisely.highlight_springmvc4.web;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lyh on 17-5-20.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
    @RequestMapping("/springboot")
    public String springboot(){

        return "HelloWorldSpirngMVC";
    }


}
