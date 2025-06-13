package com.basic;

public class LeapYear {

	   
	//y%4==0 && y%100!=0 || y%400==0
	
	//4==0&&100!=0||400==0  remember this line
	public static void leap(int y ) {
		if(y%4==0 && y%100!=0 || y%400==0 )
		{
		  System.out.println("Leap year");return;
		}
		System.out.println("Not Leap Year...."); 
		
	}
	
	public static void main(StringAll[] args) {
		int year=2004;
		leap(year);
	}
	
//	y%4==0 && y%100!=0 ||y%400==0
	
}
