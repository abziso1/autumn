package com.zhuyuanzhuo.autumn.test;

import com.zhuyuanzhuo.autumn.BeanDefinition;
import com.zhuyuanzhuo.autumn.BeanFactory;
import com.zhuyuanzhuo.autumn.test.bean.UserService;
import org.junit.Test;


public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
