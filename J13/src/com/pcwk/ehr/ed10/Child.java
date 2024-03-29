/**
 * Package Name : com.pcwk.ehr.ed10 <br>
 * Class Name   : Child.java <br>
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
package com.pcwk.ehr.ed10;

/**
 * @author acorn
 *
 */
public class Child extends ParentFinal {
	int newSize;
	public Child(int newSize) {
		super(newSize);
		
	}
	
	//Cannot override the final method from ParentFinal
//	@Override
//	final void getMaxSize() {
//		
//	}
}
