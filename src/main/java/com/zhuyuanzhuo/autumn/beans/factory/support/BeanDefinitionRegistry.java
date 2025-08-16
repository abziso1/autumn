package com.zhuyuanzhuo.autumn.beans.factory.support;

import com.zhuyuanzhuo.autumn.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
