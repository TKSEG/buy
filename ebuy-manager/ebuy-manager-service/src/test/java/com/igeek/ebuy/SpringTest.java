package com.igeek.ebuy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yangbo on 2019/6/19.
 */
public class SpringTest {
    public  void main(String[] args) {
        try {
            //手动创建spring容器
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
            //让程序暂停
            System.out.println("容器创建完成");
            System.in.read();
            System.out.println("程序结束");
        } catch (BeansException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
