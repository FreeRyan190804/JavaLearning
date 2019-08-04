package com.ryan.test;

public class InterfaceTest implements ITemp {
    public void temp() {
        ITemp.super.itemp();
        ITemp.permanance();
    }

//    public void itemp(){
//        System.out.println("This method overwrite the itemp method");
//    }

    public static void main(String[] args) {
        ITemp temp = new InterfaceTest();
        temp.itemp();
        temp.temp();
    }
}
