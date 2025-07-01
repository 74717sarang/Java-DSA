package co.string;

public class flip_String {

	public static String camleCase(String str) {
		String sentence = "flip the words in a sentence";

		String[] arr = sentence.split(" ");
		String r = "";
		for (int i = 0; i < arr.length; i++) {
			r += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
		}
		System.out.println(sentence);
		System.out.println(r);
		return r;
	}

	public static void main(String[] args) {
		String sentence = "flip the words in a sentence";

		String[] arr = sentence.split(" ");
		String result = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			result += arr[i] + " ";
		}
		System.out.println(result);

	}
}
