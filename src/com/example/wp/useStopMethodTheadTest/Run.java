package com.example.wp.useStopMethodTheadTest;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * i=1
	 i=2
	 i=3
	 i=4
	 i=5
	 i=6
	 i=7
	 i=8

	 Process finished with exit code 0
	 */
}
