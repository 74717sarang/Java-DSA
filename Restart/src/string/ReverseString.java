package string;

public class ReverseString {

	public static void main(String[] args) {
		String s = "rama and laxmana";

//		Reserved string is : anamxal dna amar

		System.out.println("Reserved string is "+reverse_forLoop(s));

	}

	private static String reverse_forLoop(String s) {

		char arr[] = s.toCharArray();

		for (int i = 0; i < s.length() / 2; i++) {
			char temp = s.charAt(i);
			arr[i] = arr[s.length() - 1 - i];
			arr[s.length() - 1 - i] = temp;
		}
		return new String(arr);
	}

}
