/**
 * Package Name : com.pcwk.ehr.ed19 <br>
 * Class Name   : AbstractMain.java <br>
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
public class AbstractMain {

	public static void main(String[] args) {
		 
		 Player play=new CDPlayer();
		 System.out.println(play instanceof CDPlayer);

		 play.play(10);//CDPlayer의 play
		 play.disp();//추상 클래스 부모의 일반 메서드
		 play.stop();//추상 메서드 제정의
		 
	}

}
