package com.example.wp.t3;

public class Run {

	/**
	 * 由 A 计算，count=4
	 由 A 计算，count=3
	 由 A 计算，count=2
	 由 A 计算，count=1
	 由 A 计算，count=0
	 由 B 计算，count=4
	 由 B 计算，count=3
	 由 B 计算，count=2
	 由 B 计算，count=1
	 由 B 计算，count=0
	 由 C 计算，count=4
	 由 C 计算，count=3
	 由 C 计算，count=2
	 由 C 计算，count=1
	 由 C 计算，count=0
	 * @param args
	 *  不共享变量
	 *  线程安全
	 */
	public static void main(String[] args) {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
	}
}
