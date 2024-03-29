/**
 * Package Name : com.pcwk.ehr.ed14 <br>
 * Class Name   : Car.java <br>
 * Description  : <br>
 * Modification information :
 *------------------------------------------------
 * 최초 생성일          : 2024-03-27<br>
 *
 *
 *------------------------------------------------
 * author : acorn
 * version: 0.5
 * see    : <br>
 * Copyright (C) by PCWK All right reserved.
 */
package com.pcwk.ehr.ed14;

public class Car {
	private String color;
	private int door;
	
	public void drive() {
		System.out.println("운전하다.");
	}
	
	public void stop() {
		System.out.println("stop.");
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
	
}
