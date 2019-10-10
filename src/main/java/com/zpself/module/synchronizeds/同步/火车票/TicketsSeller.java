package com.zpself.module.synchronizeds.同步.火车票;

import com.zpself.module.duoxiancheng.PoolExecutor;
import com.zpself.module.synchronizeds.同步.Demo;
import lombok.Data;

import java.util.concurrent.ThreadPoolExecutor;


/**
 * @author zengpeng
 * @date 2019/9/3
 */
@Data
public class TicketsSeller {
    static final Demo KEY = new Demo();
    /**
     * 总票数
     */
    private int sum ;
    /**
     * 当前以经卖票数
     */
    private int currentTickets ;
    private static ThreadPoolExecutor threadPool = PoolExecutor.getInstance();

    public static void main(String[] args) {
        TicketsSeller ts = new TicketsSeller();
        ts.setSum(1000000);
        Runnable r = ()->{
            while (true){
                synchronized(KEY) {
                    if(ts.currentTickets>=ts.sum){break;}
                    ts.seller(ts, Thread.currentThread().getName());
                }
            }
        };
        //模拟10000个用户同时抢票；但是这四个窗口会互相等待
        threadPool.execute(r);
        threadPool.execute(r);
        threadPool.execute(r);
        threadPool.execute(r);
    }

    private  void seller(TicketsSeller ts,String threadName) {
        ts.setCurrentTickets(ts.getCurrentTickets()+1);
        System.out.println(threadName+"卖出了第"+ts.getCurrentTickets()+"张票。");
    }
}
