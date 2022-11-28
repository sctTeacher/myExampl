package com.shan.tsort;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ShanCong
 * @date 2018/10/23 21:05
 * @description:
 */
public class ListSortMain {
    public static void main(String[] args) throws InterruptedException {
        List<Dog> dogList = new ArrayList<Dog>();
        for (int i = 0; i < 5; i++) {
            Dog d = new Dog();
            d.setName("dog" + i);
            d.setTime(new Date());
            dogList.add(d);
            Thread.sleep(1000);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("排序前:" + dogList.toString());
        ListSortUtil.sort(dogList, "name", true);
        System.out.println("name正排" + dogList.toString());
        ListSortUtil.sort(dogList, "name", false);
        System.out.println("name倒排" + dogList.toString());
        ListSortUtil.sort(dogList, "time", true);
        System.out.println("time正排" + dogList.toString());
        ListSortUtil.sort(dogList, "time", false);
        System.out.println("time倒排" + dogList.toString());
    }


}
