package com.zhuyuanzhuo.autumn.beans.factory.support;

import com.zhuyuanzhuo.autumn.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObject = new HashMap<>();


    @Override
    public Object getSingleton(String beanName) {
        return singletonObject.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        this.singletonObject.put(beanName, singletonObject);
    }

}
