package com.example.wp.t4_threadsafe;

public class BLogin extends Thread {
	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
