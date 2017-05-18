package com.wisely.highlight_spring4.ch2.taskcheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lyh on 17-5-18.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dataFormat = new
            SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次："+dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *")//每天11点28分 cron是unix Linux系统下的定时任务
    public void fixTimeExcution(){
        System.out.println("在指定时间："+dataFormat.format(new Date())+"执行");
    }
}
