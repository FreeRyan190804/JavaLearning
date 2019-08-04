package com.imooc.singletonmode;

public class SingletonHungry {
    private  SingletonHungry(){

    }

    private static SingletonHungry instance = new SingletonHungry();

    public static SingletonHungry getInstance(){
        return instance;
    }
}
