package com.wisely.highlight_spring4.ch2.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by lyh on 17-5-18.
 */
@Service
public class AsyncTaskService {

    @Async//通过Async注解表明该方法是一个异步方法，如果注解在类级别，则表明该类所有的方法都是异步方法，而这里的方法自动注入使用ThreadPoolTaskExecutor作为TaskExceutor
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1："+i+1);
    }
}
