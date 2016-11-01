package com.example.wp.t4;

public class Run {
    /**
     * 由 A 计算，count=4
     * 由 B 计算，count=3
     * 由 C 计算，count=2
     * 由 D 计算，count=1
     * 由 E 计算，count=0
     * 共享变量
     * 非线程安全
     */
    public static void main(String[] args) {
        MyThread mythread = new MyThread();

        Thread a = new Thread(mythread, "A");
        Thread b = new Thread(mythread, "B");
        Thread c = new Thread(mythread, "C");
        Thread d = new Thread(mythread, "D");
        Thread e = new Thread(mythread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
