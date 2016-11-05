package com.example.wp.useMethodUseStopMethod;

/**
 * Created by wpmac on 2016/11/5.
 */
public class MyThread extends  Thread {
    @Override
    public void run() {
        super.run();

        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.printf("进入catch");
            e.printStackTrace();
        }
    }
}
