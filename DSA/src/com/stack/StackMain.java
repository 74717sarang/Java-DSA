package com.stack;

public class StackMain {

	public static void main(String[] args) {

		StackCreate create=new StackCreate(5);
		  for(int i=0;i<10;i++) {
			  create.push(i);
			  //i=i+2;
		  }
		  System.out.println(create.pop());
		  System.out.println(create.pop());
		  System.out.println(create.pop()); 
		  System.out.println(create.pop());
		  System.out.println(create.pop());
		  System.out.println(create.pop());
		  
//		  System.out.println(create.pop());
//		  System.out.println(create.pop());
//		  System.out.println(create.pop());System.out.println(create.pop());System.out.println(create.pop());
//		  System.out.println(create.peek());
//		  System.out.println(create.peek());
//		  System.out.println(create.peek());

	
	}

}
