package string;

public class Repeated_Subsequence {

//	Q20: Check if a repeated subsequence is present in a string or not

	public static void main(String[] args) {
		String str = "aabb";
		System.out.println("Has repeated subsequence: " + bruteforce(str));
		System.out.println("Has repeated subsequence: " + advance(str));

	}

	private static boolean advance(String s) {
		 int n = s.length();
	        int[][] dp = new int[n + 1][n + 1];

	        // Build DP table similar to finding LCS, ensuring i != j
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
	                    dp[i][j] = 1 + dp[i - 1][j - 1];
	                } else {
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                }
	            }
	        }

	        // If length of longest repeated subsequence >= 2
	        return dp[n][n] >= 2;	
}

	private static boolean bruteforce(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					// Check if there is another occurrence after j
					for (int k = j + 1; k < str.length(); k++) {
						if (str.charAt(k) == str.charAt(j)) {
							return true;

						}
					}
				}
			}
		}

		return false;
	}

}
