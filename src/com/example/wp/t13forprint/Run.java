package com.example.wp.t13forprint;

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
	 * i=491668
	 end!
	 已经是停止状态了，我要退出了!
	 我被输出，如果此代码是for又继续运行，线程并未停止
	 */
}
