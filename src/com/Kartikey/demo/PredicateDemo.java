package com.Kartikey.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {
//        Predicate<Integer> predicate = integer -> integer%2==0;
//        System.out.println(predicate.test(9));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().filter(integer -> integer%2==0).forEach(t-> System.out.println("printing even numbers :" + t));
    }
}
