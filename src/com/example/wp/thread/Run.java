package com.example.wp.thread;

/**
 * Created by wpmac on 2016/10/22.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("Run");
    }
}
