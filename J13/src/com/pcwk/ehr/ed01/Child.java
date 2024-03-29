package com.pcwk.ehr.ed01;

import java.io.IOException;
import java.sql.SQLException;

public class Child extends Parent {

	@Override
	//IOException보다 상위에 있는 Exception은 선언할수 없다.
	//void parentMethod() throws Exception {
	void parentMethod() throws IOException {

	}

	
	
}
