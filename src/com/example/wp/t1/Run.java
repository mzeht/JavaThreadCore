package com.example.wp.t1;

public class Run {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		System.out.println("运行结束");
	}

}

/**
 * 运行结果
 * MyThread
 运行结束
 */


