package com.Kartikey.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
//        Consumer<Integer> demo = integer -> System.out.println("printing :" + integer);
//
//        demo.accept(10);

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream().forEach(integer -> System.out.println("printing :" + integer));

    }
}
