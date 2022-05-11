package com.shan.oom;


/**
 * 针对目前大家对OOM的类型不太熟悉，那么我们来总结一下各种OOM出现的情况以及解决方法。
 * 　　5. 直接内存溢出-java.lang.OutOfMemoryError: Direct buffer memory。
 * -Xmx128m -XX:MaxDirectMemorySize=100M
 *
 * 直接内存溢出，我们除了使用堆内存外，我们还可能用直接内存，即堆外内存。
 * NIO为了提高性能，避免在Java Heap和native Heap中切换，所以使用直接内存，
 * 默认情况下，直接内存的大小和对内存大小一致。堆外内存不受JVM的限制，但是受制于机器整体内存的大小限制。
 * 如下代码设置堆最大内存为128m，直接内存为100m，然后我们每次分配1M放到list里边
 *
 * 这种情况是我们使用直接内存造成溢出，这个时候我们需要检查一下程序里边是否使用的NIO及NIO，比如Netty，里边的直接内存的配置。
 */

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;


public class DirectBufferOOM {

    public static void main(String[] args) {
        final int _1M = 1024 * 1024 * 1;
        List<ByteBuffer> buffers = new ArrayList<>();
        int count = 1;
        while (true) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_1M);
            buffers.add(byteBuffer);
            System.out.println(count++);
        }

    }
}