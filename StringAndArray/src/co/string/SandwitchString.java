package co.string;

public class SandwitchString {

	public static void main(String[] args) {
		
		String str="aabcadasdaa";
		String s="aa";
		
		System.out.println(check(str,s));
		System.out.println(check2(str));
	}

	private static boolean check2(String str) {
 
		int length=str.length();
		for(int i=1;i<=length/2;i++) {
			String s=str.substring(0,i);
			if(str.startsWith(s)&& str.endsWith(s));
			return true;
		}
		
		return false;
	}

	public static boolean check(String str, String s) {
          if(str==null && s==null)return false;
		return str.startsWith(s)&& str.endsWith(s);
	}
	
	
}
