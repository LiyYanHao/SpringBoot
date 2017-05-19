package com.wisely.highlight_spring4.ch3.EnableAnnotation;

import com.wisely.highlight_spring4.ch2.taskexecutor.AsyncTaskService;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.AsyncConfigurationSelector;
import org.springframework.scheduling.annotation.AsyncConfigurer;

import java.lang.annotation.*;

/**
 * Created by lyh on 17-5-19.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AsyncConfigurationSelector.class)
public @interface EnableAsync {
    Class<? extends Annotation> annotation()default Annotation.class;
    boolean poxyTargetClass()default false;
    AdviceMode mode()default AdviceMode.PROXY;

}
