package com.wisely.highlight_springmvc4.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 *
 *  Created by lyh on 17-5-25.
 *
 *  pushService 里产生DeferredResult给控制器使用，通过@Scheduled注解的方法定时更新deferredResult
 */
@Service
public class PushService {

    private DeferredResult<String> deferredResult;

    public DeferredResult<String> getAsyncUpdate() {
        deferredResult = new DeferredResult<String>();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 5000)
    public void refresh(){
        if(deferredResult != null){
            deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
        }
    }

}
