package com.shan.oom;

import java.util.concurrent.TimeUnit;

/**
 * 针对目前大家对OOM的类型不太熟悉，那么我们来总结一下各种OOM出现的情况以及解决方法。
 * 　　2. 栈溢出-java.lang.OutOfMemorryError
 * 抛出来的异常如下，如果真的需要创建线程，我们需要调整帧栈的大小-Xss512k，默认帧栈大小为1M，如果设置小了，可以创建更多线程。。
 * 以上这种情况是帧栈不够用了，如果出现了这种情况，我们需要了解什么地方创建了很多线程，线上程序需要用jstack命令，将当前线程的状态导出来放到文件里边，然后将文件上传到fastthread.io网站上进行分析。
 */
public class StackOOM {

    public static void infiniteRun() {
        while (true) {
            Thread thread = new Thread(() -> {

                while (true) {
                    try {
                        TimeUnit.HOURS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        infiniteRun();
    }

}