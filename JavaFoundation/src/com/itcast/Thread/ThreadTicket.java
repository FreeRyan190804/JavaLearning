package com.itcast.Thread;

public class ThreadTicket extends Thread {
    public ThreadTicket(String name) {
        super(name);
    }

    @Override
    public void run() {
        int ticket = 100;

        while (ticket > 0) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "is selling No." + ticket + "ticket");
                ticket--;
            }
        }
    }
}
