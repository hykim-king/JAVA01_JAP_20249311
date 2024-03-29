/**
 * Package Name : com.pcwk.ehr.ed20 <br>
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
package com.pcwk.ehr.ed20;

/**
 * @author acorn
 *
 */
public class Main {


	public static void main(String[] args) {
		//Unit배열 생성
		Unit[] unitArray=new Unit[4];
		
		unitArray[0] = new Marine();
		unitArray[1] = new Tank();
		unitArray[2] = new DropShip();
		unitArray[3] = new Marine();
		
		
		//Unit이동
		for(int i=0;i<unitArray.length;i++) {
			unitArray[i].move(100, 150);
		}
		System.out.println("──────────────────────────────");
		Object[] objArray=new Object[4];
		objArray[0] = new Marine();
		objArray[1] = new Tank();
		objArray[2] = new DropShip();
		objArray[3] = new Marine();		
		
		
		for(int i=0;i<objArray.length;i++) {
			Unit u=(Unit) objArray[i];
			u.move(200, 180);
		}		
	}

}
//Marine 이동  x=100, y=150
//Tank 이동  x=100, y=150
//DropShip 이동  x=100, y=150
//Marine 이동  x=100, y=150
//──────────────────────────────
//Marine 이동  x=200, y=180
//Tank 이동  x=200, y=180
//DropShip 이동  x=200, y=180
//Marine 이동  x=200, y=180
