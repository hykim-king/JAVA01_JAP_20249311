/**
 * Package Name : com.pcwk.ehr.ed11 <br>
 * Class Name   : StaticMain.java <br>
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
package com.pcwk.ehr.ed11;

/**
 * @author acorn
 *
 */
public class StaticTest {

	static {//초기화 블럭
		
	}
	
	int age;
	static int width = 200;//클래스 변수
	
	
	
	static int max(int a, int b) {
		//age=10;
		width = 300;//클래스 변수 사용 가능
		
		return a>b?a:b;
	}
}
