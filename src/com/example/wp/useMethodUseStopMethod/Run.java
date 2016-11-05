package com.example.wp.useMethodUseStopMethod;

/**
 * Created by wpmac on 2016/11/5.
 */
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

    }

    /**
     * java.lang.ThreadDeath
     at java.lang.Thread.stop(Thread.java:836)
     at com.example.wp.useMethodUseStopMethod.MyThread.run(MyThread.java:12)
     进入catch
     */
}
