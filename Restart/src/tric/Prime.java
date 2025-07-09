package tric;

public class Prime {

	public static boolean isPrime(int n) {
		if (n%2==0) return false;
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	private static void is(int n) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
	}
	public static void main(String[] args) {
		
		int no=25;
		System.out.println("Prime No 1 to "+no +" is");
		System.out.print("1,2,");
		for(int i=2;i<no;i++) {
			if(isPrime(i)) {
				System.out.print(i+", ");
			}
		}
		System.out.println();
		is(10);
	}

	
}
