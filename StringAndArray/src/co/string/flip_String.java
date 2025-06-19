package co.string;

public class flip_String {

	
	  public static void main(String[] args) {
	        String sentence = "Flip the words in a sentence";
	  
	     String[]arr=sentence.split(" ");
	     String result="";
	     for(int i=arr.length-1;i>=0;i--) {
	    	 result+=arr[i]+" "; 
	     }
	  System.out.println(result);
	  
	  
	  }
}
