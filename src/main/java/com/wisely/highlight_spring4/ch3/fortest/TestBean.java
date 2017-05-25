package com.wisely.highlight_spring4.ch3.fortest;

/**
 * Created by lyh on 17-5-19.
 */
public class TestBean {
    private String content;

    public TestBean(String content){
        super();
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {

        return content;
    }
}
