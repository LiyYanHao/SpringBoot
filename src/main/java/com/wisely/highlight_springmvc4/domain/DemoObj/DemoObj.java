package com.wisely.highlight_springmvc4.domain.DemoObj;

/**
 * Created by lyh on 17-5-22.
 */
public class DemoObj {
    private Long id;
    private String name;

    public DemoObj() {
        super();
    }

    public DemoObj(Long id,String name){
        super();
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public Long getId() {

        return id;
    }
}
