package com.example.wp.t14;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("在sleep时被停止进入catch!"+this.isInterrupted());
			e.printStackTrace();
		}
	}

	/**
	 * run begin
	 end!
	 在sleep时被停止进入catch!false
	 java.lang.InterruptedException: sleep interrupted
	 at java.lang.Thread.sleep(Native Method)
	 at com.example.wp.t14.MyThread.run(MyThread.java:9)
	 */
}
