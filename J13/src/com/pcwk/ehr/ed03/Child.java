package com.pcwk.ehr.ed03;



public class Child extends Parent {
	int age = 12;
	
	void display() {
		System.out.println("자식 클래스의 age:"+age);
		System.out.println("부모 클래스의 age:"+super.age);
	}
}
