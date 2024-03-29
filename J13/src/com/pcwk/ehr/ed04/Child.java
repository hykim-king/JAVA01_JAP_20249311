package com.pcwk.ehr.ed04;

public class Child extends Parent {

	int childNum;
	
	public Child(int num, int childNum) {
		//명시적으로 super(num)을 호출 하지 않으면 컴파일러가 super()를 넣는다.
		super(num);
		this.childNum = childNum;
	}
	
}
