package com.huaa.chapter2.section5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/11/17 13:39
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }

}
