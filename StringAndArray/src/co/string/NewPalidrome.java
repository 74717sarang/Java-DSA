package co.string;

public class NewPalidrome {

	private static boolean check_palidrome(String s) {
        String str=s.toLowerCase();
        int left=0;
        int right=str.length()-1;
           if(str.charAt(left)!=str.charAt(right)) {
        	   return false;
           }
		  left--;
		  right--;
		return true;
	}

	
	
	public static void main(String[] args) {

		String s="A man, a plan, a canal, Panama";
		//String s="123456";
		System.out.println(s.toLowerCase().length());
	
	     String rev=" ";
	     int L=s.length()-1;
         for(int i=L;i>=0;i--) {
         rev+=s.charAt(i);
       	
         }
         System.out.println("Rev::"+rev);
         //System.out.println(rev.equals(s));
	
	if(check_palidrome(s)) {
			System.out.println("Palidrome...");
		}
		else {
			System.out.println("Not Palidrome");
		}
	}


}
