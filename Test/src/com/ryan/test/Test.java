package com.ryan.test;

public class Test {
    public static void main(String[] args){
        char a = 'A';
        char b = 'B';
        System.out.println((int)a+"************"+(int)b);
        System.out.println(a > b);
        int[] c = {0, 1};
        c[2] = c[4];

        ITemp temp = new InterfaceTest();
        temp.itemp();
        temp.temp();
        InterfaceTest temp2 = new InterfaceTest();
        temp2.itemp();
    }
}