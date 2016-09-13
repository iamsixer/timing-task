package com.feng.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    private static final Logger log = LoggerFactory.getLogger(TestMain.class);
    public static void main (String args[]){
        log.info("你好");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-base.xml");
        synchronized (TestMain.class){
            try {
                TestMain.class.wait();
            } catch (InterruptedException e) {
                log.error("启动失败", e);
                System.exit(-1);
            }
        }
    }
}
