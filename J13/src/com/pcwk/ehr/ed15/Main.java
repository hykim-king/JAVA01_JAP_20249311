/**
 * Package Name : com.pcwk.ehr.ed15 <br>
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
package com.pcwk.ehr.ed15;

import com.pcwk.ehr.ed14.*;
public class Main {


	public static void main(String[] args) {
		FireEngine  fe=new FireEngine();
		
		System.out.printf("fe instanceof FireEngine=%b%n",fe instanceof FireEngine);
		
		System.out.printf("fe instanceof Car=%b%n",fe instanceof Car);
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		
		if(fe instanceof Object) {
			System.out.println("THis is a Object instance");
			
		}
		
		//Ambulance,FireEngine 형재간 관계 없음!
//		System.out.printf("fe instanceof Ambulance=%b%n",fe instanceof Ambulance);
//		if(fe instanceof Ambulance) {
//			
//		}

	}

}
