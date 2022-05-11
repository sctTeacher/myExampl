package com.shan.oom;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 针对目前大家对OOM的类型不太熟悉，那么我们来总结一下各种OOM出现的情况以及解决方法。
 * 　　6. GC超限-java.lang.OutOfMemoryError: GC overhead limit exceeded。
 * 　　我们把各种OOM的情况列出来，然后逐一进行代码编写复现和提供解决方法。
 * -Xmx10m -Xms10m
 *JDK1.6之后新增了一个错误类型，如果堆内存太小的时候会报这个错误。如果98%的GC的时候回收不到2%的时候会报这个错误，
 * 也就是最小最大内存出现了问题的时候会报这个错误。如果代码配置了最小最大堆内存都为10m。
 *这个我们创建了一个线程池，如果线程池执行的时候如果核心线程处理不过来的时候会把数据放到LinkedBlockingQueue里边，也就是堆内存当中。
 * 这个时候我们需要检查-Xms -Xmx最小最大堆配置是否合理。
 * 再一个dump出现当前内存来分析一下是否使用了大量的循环或使用大量内存代码。
 */
public class GCOverheadOOM {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    //do nothing
                }
            });
        }

    }

}