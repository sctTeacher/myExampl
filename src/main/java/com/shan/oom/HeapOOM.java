package com.shan.oom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 针对目前大家对OOM的类型不太熟悉，那么我们来总结一下各种OOM出现的情况以及解决方法。
 *    1. 堆溢出-java.lang.OutOfMemoryError: Java heap space。
 * 　　2. 栈溢出-java.lang.OutOfMemorryError。
 * 　　3. 栈溢出-java.lang.StackOverFlowError。
 * 　　4. 元信息溢出-java.lang.OutOfMemoryError: Metaspace。
 * 　　5. 直接内存溢出-java.lang.OutOfMemoryError: Direct buffer memory。
 * 　　6. GC超限-java.lang.OutOfMemoryError: GC overhead limit exceeded。
 * 　　我们把各种OOM的情况列出来，然后逐一进行代码编写复现和提供解决方法。
 *
 *
 *1. 堆溢出-java.lang.OutOfMemoryError: Java heap space。
 以上这种情况的解决方法就是找到问题点，分析哪个地方是否存储了大量类没有被回收的情况，通过JMAP命令将线上的堆内存导出来后进行分析。
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();

        while (true) {
         TimeUnit.MILLISECONDS.sleep(1);
            list.add(new OOMObject());
        }
    }

}