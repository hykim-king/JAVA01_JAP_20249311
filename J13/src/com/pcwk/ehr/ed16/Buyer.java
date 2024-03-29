/**
 * Package Name : com.pcwk.ehr.ed16 <br>
 * Class Name   : Buyer.java <br>
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


public class Buyer {
	int money      = 1_000;//소유금액
	int bonusPoint = 0;//보너스 포인트
	
	public Buyer() {
		super();
	}
	
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.\n잔액을 확인 하세요.");
			return;
		}
		
		money = money - p.price;
		bonusPoint +=p.bonusPoint;
		
		System.out.println(p+"을/를 구입했습니다.");
		
	}
	

	
}
