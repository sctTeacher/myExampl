package com.shan.oom;
/**
 * 针对目前大家对OOM的类型不太熟悉，那么我们来总结一下各种OOM出现的情况以及解决方法。
 * 　　3. 栈溢出-java.lang.StackOverFlowError。
 * 运行之后出现的错误如下，程序每次递归的时候，程序会把数据结果压入栈，包括里边的指针等，这个时候就需要帧栈大一些才能承受住更多的递归调用。
 * 通过-Xss进行设置，上边的例子需要设置小一些，以分配更多的帧栈，这次是一个帧栈需要记录程序数据，所以需要更大的值。
 *
 * 遇到上面的情况下，那么就需要通过jstack将线程数据导到文件进行分析。找到递归的点，如果程序就是需要递归的次数的话，那么这个时候就需要增大帧栈的大小以适应程序。
 */
public class StackOFE {
 
  public static void stackOverFlowErrorMethod() {
    stackOverFlowErrorMethod();
  }
 
  public static void main(String[] args) {
    stackOverFlowErrorMethod();
  }
 
}