package string;

public class CharType {

//	Write a program to display number of LOWERCASE, UPPERCASE,
//	SPECIAL SYMBOLS, SPACES and DIGITS in a STRING?
	public static void main(String[] args) {

		String s = "PramoD123$@gmail.com ";
		char[] arr = s.toCharArray();
		int up = 0, lc = 0, dc = 0, sc = 0,spe=0;
;
		for (int i = 0; i < s.length(); i++) {
			if (arr[i] >= 65 && arr[i] <= 90) {
				up++;
			} else if (arr[i] >= 97 && arr[i] <= 122) {
				lc++;
			} else if (arr[i] >= 47 && arr[i] <= 58) {
				dc++;
			}
			
			 else if (arr[i]==' ') {
					sc++;
				}
			 else
				spe++;
		}
		
		
		System.out.println("no :of upper case letter "+up);
		System.out.println("no: of lower case letter " +lc);
		System.out.println("no: of decimal number " +dc);
		System.out.println("no: of spaces "+sc);
		System.out.println("no: of special characters " +spe);
	}

}
