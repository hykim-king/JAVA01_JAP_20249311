/**
 * Package Name : com.pcwk.ehr.ed19 <br>
 * Class Name   : Player.java <br>
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
package com.pcwk.ehr.ed19;


public abstract class Player {

	boolean pause;//일시정지
	int currentPos;//현재 play위치
	
	abstract void play(int post);//추상 메서드
	abstract void stop();//추상 메서드
	
	
	void disp() {
		System.out.println("disp()");
	}
	
	
}
