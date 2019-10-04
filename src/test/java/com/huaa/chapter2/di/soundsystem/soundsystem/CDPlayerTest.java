package com.huaa.chapter2.di.soundsystem.soundsystem;

import com.huaa.chapter2.di.soundsystem.CDPlayerConfig;
import com.huaa.chapter2.di.soundsystem.CompactDisc;
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
 * @date 2019/10/4 22:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
        cd.play();
    }

}
