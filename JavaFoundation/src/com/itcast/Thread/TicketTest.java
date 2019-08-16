package com.itcast.Thread;

/**
 *  多线程中，目前无法使用继承Thread的子类卖票，因为每次创建都是一个新空间，各卖各的，不存在读写
 *  同一个变量的情况，这也是为何建议使用Runnable interface的原因
 */
public class TicketTest {
    public static void main(String[] args) {
        Thread t1 = new ThreadTicket("windows1");
        Thread t2 = new ThreadTicket("windows2");
        Thread t3 = new ThreadTicket("windows3");

        t1.start();
        t2.start();
        t3.start();
    }
}
