/**
 * Package Name : com.pcwk.ehr.ed09 <br>
 * Class Name   : MyClass.java <br>
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
package com.pcwk.ehr.ed09;

/**
 * @author acorn
 *
 */
public class MyClass {

	private int age;//private필드

	
	public MyClass() {
		
	}
	
	//getter/setter : alt+shift+s (getter/setter)
	/**
	 * age값 가져오기
	 * @return
	 */
	public int getAge() {
		return age;//private 필드에 간접적으로 접근
	}

	/**
	 * age값 설정
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;//private 필드에 간접적으로 접근
	}
	
	
}
