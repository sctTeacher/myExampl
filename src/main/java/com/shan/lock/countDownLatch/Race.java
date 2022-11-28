package com.shan.lock.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * 有五个人，一个裁判。这五个人同时跑，裁判开始计时，五个人都到终点了，
 * 裁判喊停，然后统计这五个人从开始跑到最后一个撞线用了多长时间。
 * @author sc
 *闭锁用于所有线程等待一个外部事件的发生
 */
public class Race {
	 public static void main(String[] args) {    
	        final int num = 5;    
	        final CountDownLatch begin = new CountDownLatch(1);    
	        final CountDownLatch end = new CountDownLatch(num);    
	    
	        for (int i = 0; i < num; i++) {    
	            new Thread(new AWorker(i, begin, end)).start();    
	        }

		 // judge prepare…
	        try {    
	            Thread.sleep((long) (Math.random() * 5000));    
	        } catch (InterruptedException e1) {    
	            e1.printStackTrace();    
	        }    
	    
	        System.out.println("裁判 say : 开始跑!");
	        begin.countDown();    
	        long startTime = System.currentTimeMillis();    
	    
	        try {    
	            end.await();    
	        } catch (InterruptedException e) {    
	            e.printStackTrace();    
	        } finally {    
	            long endTime = System.currentTimeMillis();    
	            System.out.println("judge say : 全部到达!");
	            System.out.println("spend time: " + (endTime - startTime));    
	        }    
	    
	    }   
}
