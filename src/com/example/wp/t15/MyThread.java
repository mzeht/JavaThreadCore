package com.example.wp.t15;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			for(int i=0;i<100000;i++){
				System.out.println("i="+(i+1));
			}
			Thread.sleep(1000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("first interrupt,then sleep and catch");
			e.printStackTrace();
		}
	}
}
