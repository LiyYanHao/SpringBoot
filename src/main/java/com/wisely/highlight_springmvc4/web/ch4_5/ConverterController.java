package com.wisely.highlight_springmvc4.web.ch4_5;

import com.wisely.highlight_springmvc4.domain.DemoObj.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyh on 17-5-24.
 */
@Controller
public class ConverterController {


    @RequestMapping(value = "/convert",produces = {"application/x-wisely"})
    public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj){
        return demoObj;
    }




}
