package com.hxh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName test
 * @Description
 * @Author huxuanhao
 * @Date 2023/11/30 15:04
 */
public class test {
    @Test
    public void t(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(classPathXmlApplicationContext);
    }
}