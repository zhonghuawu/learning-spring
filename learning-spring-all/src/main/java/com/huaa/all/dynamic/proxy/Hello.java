package com.huaa.all.dynamic.proxy;

/**
 * Desc:
 *
 * @author zhonghua.wu
 * @date 2020/3/11 19:49
 */
public class Hello implements HelloInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello zhonghua!");
    }
}
