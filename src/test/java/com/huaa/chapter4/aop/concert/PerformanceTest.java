package com.huaa.chapter4.aop.concert;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/4 22:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class PerformanceTest {
    @Autowired
    private Performance performance;

    @Test
    public void testDI() {
        Assert.assertNotNull(performance);
    }

    @Test
    public void perform() {
        performance.perform();
    }
}
