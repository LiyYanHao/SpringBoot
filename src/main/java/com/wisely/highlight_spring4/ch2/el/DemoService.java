package com.wisely.highlight_spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by lyh on 17-5-18.
 */
@Service
public class DemoService {

    @Value("其他类的属性")
    private String another;

    public String getAnother(){
        return another;
    }

    public void setAnother(String another){
        this.another = another;
    }

}
