package com.zhuyuanzhuo.autumn.beans.factory.support;

import com.zhuyuanzhuo.autumn.beans.BeansException;
import com.zhuyuanzhuo.autumn.beans.factory.BeanFactory;
import com.zhuyuanzhuo.autumn.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object singleton = getSingleton(name);
        if (singleton != null) {
            return singleton;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
