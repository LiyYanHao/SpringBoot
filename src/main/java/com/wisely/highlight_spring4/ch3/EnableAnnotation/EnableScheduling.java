package com.wisely.highlight_spring4.ch3.EnableAnnotation;

import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

import java.lang.annotation.*;

/**
 * Created by lyh on 17-5-19.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(SchedulingConfiguration.class)
@Documented
public @interface EnableScheduling {
}
