/**
 * Package Name : com.pcwk.ehr.ed16 <br>
 * Class Name   : Product.java <br>
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


public class Product {
	int price;
	int bonusPoint;
	
	public Product(int price) {
		super();
		this.price = price;
		bonusPoint = (int)(price/10.0);//보너스 포인트 10%
	}
	
	
}
