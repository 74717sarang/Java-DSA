package string;

public class Convert_UPPER_CASE_LOWER {

//	convert UPPER CASE TO LOWER CASE & VICE VERSA?
	
	public static void main(String[] args) {
		
		String s="PraMoD ReddY GoPi RedDY";
		String r="";
		
		   for(int i=0;i<s.length();i++) {
			   char c=s.charAt(i);
			   if(c<=90 && c>=65)  r+=(char)(s.charAt(i)+32);
			   else if(c<=122 && c>=97) 
					r+=(char)(c-32);
			   else r+=" ";

		   }
		
		
		
//		for(char c:s.toCharArray()) {
//			if(c<=90 && c>=65) {
//				r+=(char) (c+32);
//			}
//			
//			else if(c<=122 && c>=97) {
//				r+=(char)(c-32);
//			}
//			else
//			r+=" ";
//		}
		System.out.println(r);
	}
}
