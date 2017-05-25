package com.wisely.highlight_springmvc4.web.ch4_4;

import com.wisely.highlight_springmvc4.domain.DemoObj.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lyh on 17-5-23.
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj){

        throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttriBute:"+msg);
    }
}
