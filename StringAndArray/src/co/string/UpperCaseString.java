package co.string;

public class UpperCaseString {

	public static void main(String[] args) {

		String str = "big black bug bit a big black dog";
		System.out.println(upperCaseConvert(str));
		
//		String result = str.replaceAll("\\b[a-z]", "");
//		System.out.println("re::"+result);
		
		
	}

	private static String upperCaseConvert(String str) {

		String[] st = str.split(" ");
		StringBuilder s1 = new StringBuilder();
		for (String s : st) {

			String s2=s.substring(0, 1).toUpperCase()+s.substring(1);
			s1.append(s2).append(" ");
		}
		return s1.toString().trim();
	}
	
	
	
	  
}
