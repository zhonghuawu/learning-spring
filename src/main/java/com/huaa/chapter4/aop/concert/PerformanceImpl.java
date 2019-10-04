package com.huaa.chapter4.aop.concert;

import org.springframework.stereotype.Component;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/4 22:06
 */
@Component
public class PerformanceImpl implements Performance {
    @Override
    public void perform() {
        System.out.println("perform a show");
    }
}
