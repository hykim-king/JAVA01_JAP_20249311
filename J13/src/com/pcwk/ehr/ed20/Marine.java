/**
 * Package Name : com.pcwk.ehr.ed20 <br>
 * Class Name   : Marine.java <br>
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
public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Marine 이동  x=%d, y=%d%n",x,y);
	}

	void stimPack() {
		System.out.println("stimPack 사용!");
	}
}
