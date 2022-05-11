package com.shan.oom;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
 
import java.lang.reflect.Method;

/**
 * 针对目前大家对OOM的类型不太熟悉，那么我们来总结一下各种OOM出现的情况以及解决方法。
 * 　　4. 元信息溢出-java.lang.OutOfMemoryError: Metaspace。
 第四种情况，元数据区域溢出，元数据区域也成为方法区，存储着类的相关信息，常量池，方法描述符，
 字段描述符，运行时产生大量的类就会造成这个区域的溢出。我们运行的时候指定一下元数据区域的大小，
 设置到idea的VM options里边：-XX:MetaspaceSize=10M -XX:MaxMetaspaceSize=30M。

 运行的结果如下，元数据信息溢出了。这种情况产生的原因有： 通过CBLIG大量生成类，导致Meta信息满了；
 JDK7的时候使用String.intern()不当，会产生大量常量数据；加载大量的jsp以及动态生成jsp文件。
 我们需要调整元数据空间的大小，如果调大了之后还出现了这种异常，我们需要分析哪里出现的溢出并fix掉
 */
public class MetaspaceOOM {
 
  static class OOMObject{}
 
  public static void main(String[] args) {
    while (true) {
      Enhancer enhancer = new Enhancer();
      enhancer.setSuperclass(OOMObject.class);
      enhancer.setUseCache(false);
      enhancer.setCallback(new MethodInterceptor() {
        public Object intercept(Object obj, Method method,
                    Object[] args, MethodProxy proxy) throws Throwable {
          return proxy.invokeSuper(obj, args);
        }
      });
      enhancer.create();
    }
  }
 
}