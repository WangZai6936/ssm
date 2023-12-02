package com.hxh;

import com.hxh.bean.Furn;
import com.hxh.service.FurnService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

/**
 * @ClassName test
 * @Description
 * @Author huxuanhao
 * @Date 2023/11/30 15:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class test {
    @Autowired
    private FurnService furnService;
    @Test
    public void t(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(classPathXmlApplicationContext);
    }
    @Test
    public void t1(){
        //ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //FurnService bean = classPathXmlApplicationContext.getBean(FurnService.class);
        Furn furn = new Furn(null, "北欧风格沙发111~", "顺平家居~", new BigDecimal(180), 666, 7, "assets/images/product-image/1.jpg");
        furnService.save(furn);
    }
}