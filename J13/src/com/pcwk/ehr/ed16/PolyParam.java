/**
 * Package Name : com.pcwk.ehr.ed16 <br>
 * Class Name   : PolyParam.java <br>
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
package com.pcwk.ehr.ed16;

/**
 * @author acorn
 *
 */
public class PolyParam {


	public static void main(String[] args) {
		Buyer b=new Buyer();
		
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Computer());
		System.out.println("====================");
		//System.out.println("잔액:"+b.money+"만원 입니다.");
		//System.out.println("보너스 점수:"+b.bonusPoint+"점 입니다.");
		
	}

}
