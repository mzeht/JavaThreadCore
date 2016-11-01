package com.example.wp.t12;

public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("是否停止1？=" + Thread.interrupted());
		System.out.println("是否停止2？=" + Thread.interrupted());
		System.out.println("end!");
	}

	/**
	 * 是否停止1？=true
	 是否停止2？=false
	 end!
	 */
}
