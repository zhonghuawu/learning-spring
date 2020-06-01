package com.huaa.chapter2.section5;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/11/17 13:37
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("bean-demoListener receive bean-demoPublisher msg: " + msg);
    }
}
