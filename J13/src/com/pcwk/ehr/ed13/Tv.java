package com.pcwk.ehr.ed13;

public class Tv {

	boolean power;//Tv 전원
	int channel;//채널
	
	public Tv() {
		
	}
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	
	void channelDown() {
		channel--;
	}
	
}
