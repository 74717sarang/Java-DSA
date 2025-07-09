package tric;

public class ReverseNumber {

	public static void main(String[] args) {
       int n=1221;
       int rev=0;
       System.out.println();
      System.out.println("Number Palidrome "+isPalidrome(n));
       System.out.println("Reverse Number is");
       while(n!=0){
    	rev=rev*10+n%10;
    	n/=10;
       }
       
       System.out.println(rev);
	}

	private static boolean isPalidrome(int n) {

		int num=n;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		
		return n==rev;
		
	}

}
