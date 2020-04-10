package cn.sz.lb.test;

import java.util.ArrayList;
import java.util.List;

public class Hj {
    public static void main(String[] args) {
        System.out.println("ss");
        for (int i = 0; i <10 ; i+=3) {
            System.out.println(i);
        }

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (String s : list) {
            System.out.println(s);
        }

    }
}




