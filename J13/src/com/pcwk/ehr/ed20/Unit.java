/**
 * Package Name : com.pcwk.ehr.ed20 <br>
 * Class Name   : Unit.java <br>
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
package com.pcwk.ehr.ed20;


public abstract class Unit {

	int x;//좌표 x
	int y;//좌표 y
	
	//추상 메서드
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("현재 위치에 정지!");
	}
	
}
