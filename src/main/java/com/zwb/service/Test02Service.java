package com.zwb.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;


@Service("test02Service")
public class Test02Service {

    @Autowired
    private ThreadPoolTaskExecutor executor;

    public String m1() {


        for (int i = 0; i < 5; i++) {

            CompletableFuture.runAsync(() -> {
               /* try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                System.out.println(Thread.currentThread().getName() + "----------");
            }, executor);

        }
        return "ok";
    }

//    ync-executor-zwb-6----------
//    sync-executor-zwb-5----------
//    sync-executor-zwb-4----------
//    sync-executor-zwb-8----------
//    sync-executor-zwb-3----------
//    sync-executor-zwb-2----------
//    sync-executor-zwb-1----------
//    sync-executor-zwb-9----------
//    sync-executor-zwb-10----------
//    sync-executor-zwb-7----------
//    sync-executor-zwb-5----------
//    sync-executor-zwb-4----------
//    sync-executor-zwb-8----------
//    sync-executor-zwb-3----------
//    sync-executor-zwb-6----------
//    sync-executor-zwb-2----------
//    sync-executor-zwb-1----------
//    sync-executor-zwb-9----------
//    sync-executor-zwb-10----------
//    sync-executor-zwb-7----------
//    sync-executor-zwb-3----------
//    sync-executor-zwb-6----------
//    sync-executor-zwb-4----------
//    sync-executor-zwb-2----------
//    sync-executor-zwb-8----------
//    sync-executor-zwb-5----------
//    sync-executor-zwb-1----------
//    sync-executor-zwb-10----------
//    sync-executor-zwb-9----------
//    sync-executor-zwb-7----------
//    sync-executor-zwb-5----------
//    sync-executor-zwb-2----------
//    sync-executor-zwb-4----------
//    sync-executor-zwb-8----------
//    sync-executor-zwb-6----------
//    sync-executor-zwb-3----------
//    sync-executor-zwb-1----------
//    sync-executor-zwb-10----------
//    sync-executor-zwb-9----------
//    sync-executor-zwb-8----------
//    sync-executor-zwb-5----------
//    sync-executor-zwb-7----------
//    sync-executor-zwb-6----------
//    sync-executor-zwb-2----------
//    sync-executor-zwb-3----------
//    sync-executor-zwb-4----------
//    sync-executor-zwb-1----------
//    sync-executor-zwb-9----------
//    sync-executor-zwb-10----------

}
