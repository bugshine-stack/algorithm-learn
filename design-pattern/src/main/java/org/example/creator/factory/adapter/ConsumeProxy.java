package org.example.creator.factory.adapter;

import java.lang.reflect.Proxy;

public class ConsumeProxy {

    public static <T> T getProxy(Class<T> interfaceClass, ConsumeAdapter consumeAdapter) {
        ConsumeInvocationHandler handler = new ConsumeInvocationHandler(consumeAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }
}
