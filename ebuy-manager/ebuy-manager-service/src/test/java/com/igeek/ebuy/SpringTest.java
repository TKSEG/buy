package com.igeek.ebuy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yangbo on 2019/6/19.
 */
public class SpringTest {

    public static void main(String[] args) throws IOException {
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


/*
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-service.xml");
     //   itemService.getItemList(page, rows)
     //   OrderService orderService = applicationContext.getBean(OrderService.class);

    //    orderService.initOrder("1");
        System.out.println("调用完成....");
        System.in.read();
    }
*/
}
