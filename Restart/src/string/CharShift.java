package string;

public class CharShift {

	public static void main(String[] args) {
		String input = "abcE"; // a->a+2==c shift+2 all
//		 Output: cdeG
		String result = "";

		System.out.println();
		for (char ch : input.toCharArray()) {
			char shifted = (char) (ch + 2);
			result += shifted;
		}

//	        for(int i=0;i<input.length();i++) {
//	        	char c=(char) ((char)input.charAt(i)+2);
//	        	result+=c;
//	        }

		System.out.println(result); // Output: cdeG

	}

}
