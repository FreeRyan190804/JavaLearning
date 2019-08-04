package com.imooc.animal;

public class Cat extends Animal {
    @Override
    public void run(){
        System.out.println("Cat is running.");
    }

    public void sleep(){
        System.out.println("Cat sleeps.");
    }
}
