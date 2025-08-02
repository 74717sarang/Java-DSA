package tric;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 13561;
		int rev = 0;
		int s = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
		System.out.println("New Way" + s);
		System.out.println("Number Palidrome " + isPalidrome(n));
		System.out.println("Reverse Number is");

		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}

		System.out.println(rev);
		n = -145;
		System.out.println("Number Reverse negative " + isReverse(n)); // -541

	}

	private static int isReverse(int n) {
		int rev = 0;

		int num=n;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		

		return rev;
	}

	private static boolean isPalidrome(int n) {

		int num = n;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}

		return n == rev;

	}

}
