package com.parctics;

import java.util.Map;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {

		System.out.println("randaom::"+Math.random() );
		
//		
//		Stream<Double>stream=Stream.generate(()->Math.random()).limit(5);		
//	      stream.forEach(System.out::println);
//	      Stream<Integer>str=Stream.iterate(1, i->i+1).limit(5); 
//	         System.out.println();
//	     str.forEach(System.out::print);
	  //Map<str, String>map;
	    
		  int n=5;
		for(int i=0;i<n ;i++)
		{
		for (int j=0;j<n-i;j++)
		{
		System.out.print(" ");
		}
		for(int k=0;k<=i; k++)
		{
		System.out.print("* ");
		}
		System.out.println( );
		}
	
	System.out.println("---------");	
	
	  for(int i=n;i>=0;i--) {
		  
		  for(int j=0;j<=n-i;j++) {
			  System.out.print(" ");
		  }
		  
		  for(int k=0;k<2*i+1;k++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
			  
	
	
	}

}
