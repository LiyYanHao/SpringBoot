package com.wisely.highlight_springmvc4.web.ch4_3;

import com.wisely.highlight_springmvc4.domain.DemoObj.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lyh on 17-5-22.
 */
@RestController//声明控制器。并且返回数据时不需要@RequestBody
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value =
    "/getjosn",method= RequestMethod.GET,produces={"application/json;charset=UTF-8"})//返回数据类型为json
    public DemoObj getJson (){//直接返回对象自动转换为json
        DemoObj liyanhao = new DemoObj(1l, "liyanhao");
        return liyanhao;
    }

    @RequestMapping(value = "/getXml",produces = {"application/xml;charset=Utf-8"})//返回数据类型为xml
    public DemoObj getXml(DemoObj obj){

        return new DemoObj(obj.getId()+1,obj.getName()+"yy");//自动转换为xml
    }
    @RequestMapping(value = "/getStr",produces = {"text/json;charset=UTF-8"})//返回数据类型为xml
    public String getStr(DemoObj obj){

        return "1231231231";//自动转换为xml
    }

}
