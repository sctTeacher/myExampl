package com.shan.lock.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 继续，还是这五个人（这五个人真无聊..），这次没裁判。规定五个人只要都跑到终点了，大家可以喝啤酒。但是，
 * 只要有一个人没到终点，就不能喝。 这里也没有要求大家要同时起跑(当然也可以，加latch)
 * @author sc
 *栅栏则是所有线程相互等待，直到所有线程都到达某一点时才打开栅栏，然后线程可以继续执行。
 */
public class Beer {

	 
    public static void main(String[] args) {  
        final int count = 5;  
        final CyclicBarrier barrier = new CyclicBarrier(count, new Runnable() {  
            @Override  
            public void run() {  
                System.out.println("喝 啤酒!");
            }  
        });  
  
        // they do not have to start at the same time
        for (int i = 0; i < count; i++) {  
            new Thread(new Worker(i, barrier)).start();  
        }  
    }  
  
}  
  
class Worker implements Runnable {  
    final int id;  
    final CyclicBarrier barrier;  
  
    public Worker(final int id, final CyclicBarrier barrier) {  
        this.id = id;  
        this.barrier = barrier;  
    }  
  
    @Override  
    public void run() {  
        try {  
            System.out.println(this.id + " 开始跑 !");
            Thread.sleep((long) (Math.random() * 10000));  
            System.out.println(this.id + "到达!");
            this.barrier.await();  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        } catch (BrokenBarrierException e) {  
            e.printStackTrace();  
        }  
    } 
	
	
}
