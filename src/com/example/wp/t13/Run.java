package com.example.wp.t13;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}


	/**
	 * i=460429
	 i=460430
	 end!
	 已经是停止状态了，我要退出了!
	 */
}
