package com.example.wp.t15;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		thread.interrupt();
		System.out.println("end!");
	}

	/**
	 * end!
	 run begin
	 i=1
	 i=2
	 .......
	 .......
	 i=99999
	 i=100000
	 first interrrupt,then sleep and catch
	 java.lang.InterruptedException: sleep interrupted
	 at java.lang.Thread.sleep(Native Method)
	 at com.example.wp.t15.MyThread.run(MyThread.java:12)

	 */
}
