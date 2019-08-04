package com.ryan.test;

public interface ITemp {
    void temp();

    default void itemp(){
        System.out.println("This is a temp interface");
    }

    static void permanance(){
        System.out.println("This is a permanent method.");
    }
}
