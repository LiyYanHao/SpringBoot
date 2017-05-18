package com.wisely.highlight_spring4.ch2.taskcheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by lyh on 17-5-18.
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.taskcheduler")
@EnableScheduling
public class TaskSchulerConfig {
}
