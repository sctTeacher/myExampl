package com.shan.lock.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class AWorker implements Runnable {
	  final CountDownLatch begin;    
	  final CountDownLatch end;    
	  final int id;  
	  public AWorker(final int id, final CountDownLatch begin,    
	            final CountDownLatch end) {    
	        this.id = id;    
	        this.begin = begin;    
	        this.end = end;    
	    }    
	    
	    @Override    
	    public void run() {    
	        try {    
	            System.out.println(this.id +" 准备 !");
	            begin.await();    
	            // run��    
	            Thread.sleep((long) (Math.random() * 10000));    
	        } catch (Throwable e) {    
	            e.printStackTrace();    
	        } finally {    
	            System.out.println(this.id +" 抵达 !");
	            end.countDown();    
	        }    
	    }    

}
