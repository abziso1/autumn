package com.zhuyuanzhuo.autumn.beans.factory;

import com.zhuyuanzhuo.autumn.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
