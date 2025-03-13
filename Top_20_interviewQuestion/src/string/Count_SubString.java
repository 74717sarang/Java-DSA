package string;

//Q14: Count number of substrings
public class Count_SubString {

	  public static int countSubstrings(String s) {
	        int n = s.length();
	        return (n * (n + 1)) / 2;
	    }

	    public static void main(String[] args) {
	        String s = "abc";
	        System.out.println("Number of substrings: " + countSubstrings(s));
	    }
}
