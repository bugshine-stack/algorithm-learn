package org.example.creator.factory.adapter;

import org.example.creator.factory.adapter.ConsumeAdapter;
import sun.misc.ClassLoaderUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ConsumeInvocationHandler implements InvocationHandler {

    private ConsumeAdapter consumeAdapter;

    public ConsumeInvocationHandler(ConsumeAdapter consumeAdapter) {
        this.consumeAdapter = consumeAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ConsumeAdapter.class.getMethod(method.getName(), String.class).invoke(consumeAdapter, args);
    }
}
