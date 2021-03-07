package com.zwb.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;



/*
    线程池配置
*/

@Configuration
@EnableAsync
public class ThreadPoolConfig {

    @Autowired
    private ThreadPoolProperty poolProperty;

    @Bean
    public ThreadPoolTaskExecutor syncExecutor(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setThreadNamePrefix(poolProperty.getThreadNamePrefix());
        threadPoolTaskExecutor.setCorePoolSize(poolProperty.getCorePoolSize());
        threadPoolTaskExecutor.setMaxPoolSize(poolProperty.getMaxPoolSize());
        threadPoolTaskExecutor.setQueueCapacity(poolProperty.getQueueCapacity());
        threadPoolTaskExecutor.setKeepAliveSeconds(poolProperty.getKeepAliveSeconds());
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        return threadPoolTaskExecutor;
    }



}
