package com.wisely.highlight_springmvc4.web.ch4_3;

import com.wisely.highlight_springmvc4.domain.DemoObj.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lyh on 17-5-22.
 */
@Controller//注解表明是一个控制器
@RequestMapping("/anno")//映射类的访问路径是anno
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")//此方法未标注路径，因此使用类级别的路径/anno，
                                                            // 或需要返回值的是json对象，则设置produces="application/json,charset='UTF-8'"
                                                            //
    public @ResponseBody String index(HttpServletRequest request){//演示可接受HttpServletRequert作为参数，当然也可以接受HttpResponse作为参数，

        return "url:" + request.getRequestURL() + "can access";
    }

    @RequestMapping(value = "/pather/{str}",produces = "text/plain;charset=UTF-8")//演示接受路径参数。并且在方法参数前结合@PathVariable使用，访问路径/anno/pather/
    public @ResponseBody String demoPathVar(@PathVariable String str,HttpServletRequest request){

        return "url:" + request.getRequestURL() + "can access, str:"+str;
    }

    @RequestMapping(value = "/requestParam",produces = "text/plain;charset=UTF-8")//演示常规的的request参数获取，访问路近/anno/requestParam?id=1
    public @ResponseBody String passRequestparam(Long id,HttpServletRequest request){

        return "url :"+request.getRequestURL()+
                "can accees, obj id:" + id;
    }

    @RequestMapping(value = "/obj",produces = "application/json;charset=UTF-8")//演示常规的request参数获取，访问路径为/anno/obj?id=1?name=xx
    @ResponseBody//可用在方法前
    public String passObj(DemoObj obj,HttpServletRequest request){

        return "url:" + request.getRequestURL() +"can access,obj id:"+ obj.getId()+" obj name"+
                obj.getName();
    }

    @RequestMapping(value = {"/name1", "/name2"},produces = "text/plainl;charset=UTF-8")//演示映射不同的路径到相同的方法，访问路径为/anno/name1或/anno/name2
    public @ResponseBody String remove(HttpServletRequest request){

        return "url:"+request.getRequestURL() + "can access";
    }
}
