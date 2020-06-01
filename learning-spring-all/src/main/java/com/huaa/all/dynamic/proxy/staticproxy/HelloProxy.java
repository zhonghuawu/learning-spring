package com.huaa.all.dynamic.proxy.staticproxy;

import com.huaa.all.dynamic.proxy.Hello;
import com.huaa.all.dynamic.proxy.HelloInterface;

/**
 * Desc:
 *
 * @author zhonghua.wu
 * @date 2020/3/11 19:50
 */
public class HelloProxy implements HelloInterface {

    private HelloInterface helloInterface = new Hello();

    @Override
    public void sayHello() {
        System.out.println("Before invoke sayHello");
        helloInterface.sayHello();
        System.out.println("After invoke sayHello");
    }

    public static void main(String[] args) {
        HelloProxy helloProxy = new HelloProxy();
        helloProxy.sayHello();
    }

}
