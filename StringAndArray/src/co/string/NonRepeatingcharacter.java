package co.string;

public class NonRepeatingcharacter {

//	4. First non-repeating character — who stands alone?

	public static void main(String[] args) {
		String input = "swiss";
        System.out.println( firstNonRepeatingChar(input));
	}

private static char firstNonRepeatingChar(String input) {

	  int []check=new int[256];
	   for(char c:input.toCharArray()) {
		   check[c]++;
	   }
	   for(char c:input.toCharArray())  {
		   if(check[c]==1) return c;
		   
	   }   
	  
	
	return '\0';
}
}
