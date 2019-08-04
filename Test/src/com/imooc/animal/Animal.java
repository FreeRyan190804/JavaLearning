package com.imooc.animal;

public class Animal {
    public String name;
    public int month;

    public Animal(){

    }

    public void eat(){
        System.out.println(this.name + "is eating");
    }

    public void run(){
        System.out.println("Animal is running.");
    }

    public void help(final Animal temp){
//        temp = new Animal();
        temp.name = "NiuNiu";
        temp.eat();
    }
}
