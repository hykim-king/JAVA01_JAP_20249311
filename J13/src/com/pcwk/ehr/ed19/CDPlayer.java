/**
 * Package Name : com.pcwk.ehr.ed19 <br>
 * Class Name   : CDPlayer.java <br>
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

/**
 * @author acorn
 *
 */
public class CDPlayer extends Player {

	@Override
	void play(int post) {
		System.out.println("CDPlayer:play() "+post);
		
	}

	@Override
	void stop() {
		System.out.println("CDPlayer stop()");
		
	}

}
