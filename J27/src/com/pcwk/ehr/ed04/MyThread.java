package com.pcwk.ehr.ed04;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+". MyThread.class");
		}

	}

}
