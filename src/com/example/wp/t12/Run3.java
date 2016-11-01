package com.example.wp.t12;

public class Run3 {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("是否停止1？="+thread.isInterrupted());
			System.out.println("是否停止2？="+thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

	/**
	 * i=135147
	 i=135148
	 是否停止1？=true
	 是否停止2？=true
	 end!
	 i=135149

	 this.interrupter()方法用来检测“当前线程”的中断状态，且会将中断状态标志清除。
	 this.isInterrupted()方法用来检测“this”的中断状态，且不会改变线程的状态标志。

	 解释：
	 interrupter()实际上是一个静态方法！

	 /*
	 实际上还是调用isInterrupted()方法，但是多了一个获取当前线程的操作
	 */


}

