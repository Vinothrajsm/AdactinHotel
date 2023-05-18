package org.com;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdactinHotel {
	@BeforeSuite
	private void beforesuite() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	private void beforetest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	private void beforeclass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod 
	private void beforemethod() {
	System.out.println("BeforeMethod");
	}
	@Test(enabled=false)
	private void test01() {
		System.out.println("Test01");
	}
	@Test(priority=10)
	private void test02() {
		System.out.println("Test02");
	}
	@Test(priority=-10)
	private void test03() {
		System.out.println("Test03");
	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("AfterMethod");
	}
	@AfterClass()
	private void afterclass() {
		System.out.println("AfterClass");
	}
	@AfterTest
	private void aftertest() {
		System.out.println("AfterClass");

	}
	@AfterSuite
	private void aftersuit() {
	System.out.println("AfterSuit");

	}

	

	
	

	}


