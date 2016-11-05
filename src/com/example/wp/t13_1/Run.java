package com.example.wp.t13_1;

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
	 * i=475159
	 end!
	 已经是停止状态
	 进行MyThread.java类run方法中的catch
	 java.lang.InterruptedException
	 at com.example.wp.t13_1.MyThread.run(MyThread.java:11)
	 */
}
