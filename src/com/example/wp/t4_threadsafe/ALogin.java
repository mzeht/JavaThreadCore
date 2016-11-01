package com.example.wp.t4_threadsafe;

public class ALogin extends Thread {
	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
