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
package com.pcwk.ehr.ed17;


public class Buyer {
	int money      = 1_000;//소유금액
	int bonusPoint = 0;//보너스 포인트
	
	Product[] item=new Product[10];//구입한 제품 저장용 배열
	int i = 0; //Product배열에 사용될 카운터
	
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
		
		//추가 코드: 제품정보 저장
		item[i++] = p;
		
		System.out.println(p+"을/를 구입했습니다.");
		
	}
	
	void summary() {
		int sum = 0; //구입 물품 합계
		String itemList = "";//품목 정보
		
		for(int i=0;i<item.length;i++) {
			if(null==item[i]) {
				break;
			}
			
			sum +=item[i].price;
			itemList+=item[i]+",";
		}
		
		System.out.println("구입하신 물품의 총금액은:"+sum+" 입니다.");
		System.out.println("구입하신 제품은 "+itemList+" 입니다.");
		
		
	}
	
	

	
}
