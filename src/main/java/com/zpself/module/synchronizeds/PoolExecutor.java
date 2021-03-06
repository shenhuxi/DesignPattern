package com.zpself.module.duoxiancheng;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zengpeng
 * @date 2019/7/30
 */
public class PoolExecutor {
    private static ThreadPoolExecutor threadPool = null;
    private PoolExecutor(){

    }

    /**
     * 获取线程池对象
     */
    public static ThreadPoolExecutor getInstance(){
        if(threadPool ==null){
            threadPool  = new ThreadPoolExecutor(4, 4, 15,
                    TimeUnit.SECONDS, new LinkedBlockingQueue<>(),
                    new ThreadPoolExecutor.CallerRunsPolicy());
            threadPool.prestartAllCoreThreads();
        }
        return threadPool;
    }
}