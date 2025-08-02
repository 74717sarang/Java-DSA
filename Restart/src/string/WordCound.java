package string;

public class WordCound {

	public static void main(String[] args) {

		String d = "rama and laxmana";
		String[] arr = d.split(" ");

		for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]+" "+arr[i].length());
		}
	}

}
