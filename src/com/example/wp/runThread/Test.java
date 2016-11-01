package com.example.wp.runThread;

/**
 * Created by wpmac on 2016/11/1.
 */
public class Test {


    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.printf(runThread.getName()+" "+runThread.getId());
    }

    //main 1
}
