package com.imooc.animal;

public class AnimalTest {
    public static void main(String[] args){
        Animal one = new Animal();
        System.out.println(one);
        one.name = "huahua";
        Animal two = new Animal();
        one.name = "fanfan";
        one.help(two);
        Cat three = new Cat();
        System.out.println(three);
        Animal four = new Cat();
        System.out.println(four);
        Cat five;
        one = three;
        one.run();
        two.run();
        five = (Cat)two;
        five.sleep();
    }
}
