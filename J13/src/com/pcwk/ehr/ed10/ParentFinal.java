/**
 * Package Name : com.pcwk.ehr.ed10 <br>
 * Class Name   : ParentFinal.java <br>
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


// 상속을 허용하지 않는다.
public  class ParentFinal {
	final int MAX_SIZE;//값을 변경할수 없다.
	
	public ParentFinal(int size) {
		MAX_SIZE = size;
	}
	
	final void getMaxSize() {
		final int LV = 14;
	}
}
