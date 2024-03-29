/**
 * Package Name : com.pcwk.ehr.ed20 <br>
 * Class Name   : DropShip.java <br>
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

/**
 * @author acorn
 *
 */
public class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("DropShip 이동  x=%d, y=%d%n",x,y);
	}

	void load() {
		System.out.println("DropShip load");
	}
	
	void unLoad() {
		System.out.println("DropShip unLoad");
	}	
}
