package string;

public class LongestDistinatSubString {

	public static void main(String[] args) {

	    String s = "abcabcbb";
        String result = longestDistinctSubstring(s);
        System.out.println("Longest substring with distinct characters: " + result);
	}

	private static String longestDistinctSubstring(String s) {

		
		String result="";
		   
		for(int i=0;i<s.length();i++) {
			StringBuilder  current=new StringBuilder();
			for(int j=i;j<s.length();j++) {
			
				char c=s.charAt(j);
				if(current.indexOf(String.valueOf(c))!=-1) {
					break;  // char present in string
				}
				current.append(c);
				if(current.length()>result.length()){
					result=current.toString();
				}
				
			}
			
		}
		
		
		
		
		return result;
	}

}
