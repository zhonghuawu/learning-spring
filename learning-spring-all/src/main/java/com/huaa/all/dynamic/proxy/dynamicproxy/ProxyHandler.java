package com.huaa.all.dynamic.proxy.dynamicproxy;

import com.huaa.all.dynamic.proxy.Hello;
import com.huaa.all.dynamic.proxy.HelloInterface;
import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Desc:
 *
 * @author zhonghua.wu
 * @date 2020/3/11 19:52
 */
@AllArgsConstructor
public class ProxyHandler implements InvocationHandler {
    private Object object;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoke: " + method.getName());
        method.invoke(object, args);
        System.out.println("After invoke: " + method.getName());
        return null;
    }

    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        HelloInterface hello = new Hello();
        InvocationHandler handler = new ProxyHandler(hello);
        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), handler);

        proxyHello.sayHello();
    }
}
