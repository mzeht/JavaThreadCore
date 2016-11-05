package com.example.wp.t17;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}


	/**
	 *不使用Thread.yield();
	 * use time13535ms
	 *
	 * 使用Thread.yield();
	 * use time11440ms
	 *
	 */
}
