package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

public class TEST {
	
	@Test (dataProvider = "sai")
	public void test1(String UserName, String Password, String Age ) {
		System.out.println(UserName);
		System.out.println(Password);
		System.out.println("test1");
		
	}

	@DataProvider (name ="sai")
	public Object [][] readExcel(){	
		return Base.getData();
		
	}
	
}
