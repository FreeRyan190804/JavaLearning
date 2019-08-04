package com.imooc.test;

import com.imooc.singletonmode.SingletonHungry;
import com.imooc.singletonmode.SingletonLazy;

public class TestSingletonMode {
    public static void main(String[] args){

        SingletonHungry one = SingletonHungry.getInstance();
        SingletonHungry two = SingletonHungry.getInstance();

        SingletonLazy three = SingletonLazy.getInstance();
        SingletonLazy four = SingletonLazy.getInstance();

        System.out.println(one + "/n" + two);
        System.out.println("=====================");
        System.out.println(three + "/n" + four);
    }
}
