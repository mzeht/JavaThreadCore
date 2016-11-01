package com.example.wp.thread;

/**
 * Created by wpmac on 2016/10/22.
 */
public class MyThread extends Thread {


    @Override
    public void run() {
        System.out.printf("MyThread running");
        super.run();
    }
}
