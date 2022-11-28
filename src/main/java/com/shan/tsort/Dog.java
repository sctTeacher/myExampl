package com.shan.tsort;

import java.util.Date;

/**
 * @author ShanCong
 * @date 2018/10/23 21:02
 * @description:
 */
public class Dog {
    private String name;

    private Date time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
