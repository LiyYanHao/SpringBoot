package com.wisely.highlight_spring4.ch2.taskcheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lyh on 17-5-18.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskSchulerConfig.class);

    }
}
