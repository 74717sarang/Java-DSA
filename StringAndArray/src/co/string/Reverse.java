package co.string;

public class Reverse {

	public static void main(String[] args) {

		String str = "abc";
		System.out.println(fun1(str));
	}

	private static String fun1(String str) {
		char[] arr = str.toCharArray();
		int left = 0, rigth = str.length()-1;

		while (left < rigth) {
			char temp = arr[left];
			arr[left++] = arr[rigth];
			arr[rigth--] = temp;
		}
		return new String(arr);
	}
}
