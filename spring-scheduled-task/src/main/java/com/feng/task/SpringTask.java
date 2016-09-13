package com.feng.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SpringTask {

    /**
     * 当一次方法执行完毕之后，延迟多少毫秒再执行该方法
     */
    @Scheduled(fixedDelay=5000)
    public void doSomething1() {
        System.out.print("doSomething1");
    }

    /**
     * 每隔5秒执行一次
     */
    @Scheduled(fixedRate=5000)
    public void doSomething2() {
        System.out.print("doSomething2");
    }

    @Scheduled(initialDelay=1000, fixedRate=5000)
    public void doSomething3() {
        System.out.print("doSomething3");
    }

    /**
     * 每5秒执行一次,详细配置了该方法在什么时候执行。cron值是一个cron表达式
     */
    @Scheduled(cron="0/5 * *  * * ? ")
    public void doSomething4() {
        System.out.print("doSomething4");
    }


}
