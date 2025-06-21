package co.string;

public class CountChar {

	public static void main(String[] args) {
		String str = "aaabaczeeeeeed";
		int[] frq = new int[str.length()];
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			frq[i] = 1;
			int cnt = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					frq[i]++;
					cnt++;
					arr[j] = '\0';
				}
			}
			if (arr[i] != '\0')
				System.out.println(arr[i] + "  count " + frq[i] + " " + cnt);
		}

		System.out.println();
		System.out.println("maxcount char is: ");
		int max = 1;
		char c = '\0';
		for (int j = 0; j < arr.length; j++) {
			if (frq[j] > max) {
				c = arr[j];
				max=frq[j];
			}
		}
		System.out.println(c+" Times "+max);
	}
}