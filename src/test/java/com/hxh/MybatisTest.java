package com.hxh;

import com.hxh.bean.Furn;
import com.hxh.mapper.FurnMapper;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @ClassName MybatisTest
 * @Description
 * @Author huxuanhao
 * @Date 2023/11/30 15:44
 */
public class MybatisTest {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定配置文件
        File configFile = new File("mybatis.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("逆向生成 OK");
    }
    @Test
    public void add(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        FurnMapper bean = classPathXmlApplicationContext.getBean(FurnMapper.class);
        Furn furn = new Furn(null, "北欧风格沙发~", "顺平家居~", new BigDecimal(180), 666, 7, "assets/images/product-image/1.jpg");
        int i = bean.insertSelective(furn);
        System.out.println(i);
    }
}