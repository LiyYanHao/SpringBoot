package com.wisely.highlight_springmvc4.web.ch4_5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by lyh on 17-5-25.
 * 服务推送事件
 */
@Controller
public class SecController {

    @RequestMapping(value = "/push",produces = "text/event-stream")//服务端sse的支持，
    public @ResponseBody String psuh(){
        Random r = new Random();
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "data:Testing 1,2,3" + r.nextInt() + "\n\n";
    }
}
