package com.wisely.highlight_spring4.ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lyh on 17-5-19.
 */

@RunWith(SpringJUnit4ClassRunner.class)//在junit环境下提供spring TestContext FrameWork的功能
@ContextConfiguration(classes = {TestConfig.class})//用来加载配置AppactionContext,其中classes属性用来加载配置类
@ActiveProfiles("prod")//ActiveProfiles声明活动的profile
public class DemoBeanIntegrationTests {
    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInJect(){
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}
