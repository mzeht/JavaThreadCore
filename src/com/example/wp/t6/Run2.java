package com.example.wp.t6;

public class Run2 {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.setName("hehe");
		 mythread.start();
//		mythread.run();
	}
}
