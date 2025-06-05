package com.newtest;

public interface interfaceA {

	int a=10;

	// we can not override static methode
	public static int name() {return 1;}; 
	public static  void fun() {}; 
	
	
	// compulsory to override
	public void fum();
	
	
	
}
