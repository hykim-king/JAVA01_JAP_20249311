/**
 * Package Name : com.pcwk.ehr.ed14 <br>
 * Class Name   : Main.java <br>
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

/**
 * @author acorn
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = null;
		FireEngine  fe=new FireEngine();
		
		fe.water();

		//자손타입 → 조상타입 :  형변환 생략 가능
		car = fe;
		//호출불가
		//car.water();
		
		FireEngine fe2 = null;
		
		//조상타입 → 자손타입 :  형변환 생략 불가
		fe2 = (FireEngine) car;
		
		fe2.water();
	}

}
