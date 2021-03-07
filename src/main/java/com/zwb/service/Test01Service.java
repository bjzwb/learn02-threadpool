package com.zwb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

@Service("test01Service")
public class Test01Service {

    //去掉效果一样
    @Autowired
    @Qualifier("syncExecutor")
    ThreadPoolTaskExecutor syncExecutor;

    @Async
    public String m1() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "------");

        return "ok";
    }
}
