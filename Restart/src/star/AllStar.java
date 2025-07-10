package star;

public class AllStar {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------    -------");

		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------    -------");

		for (int j = 0; j < n; j++) {

			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------    -------");

		for (int j = 0; j <= n; j++) {

			for (int k = 0; k <= n; k++) {
				if (j == 0 || k == 0 || k == n || j == n)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("------    -------");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------    -------");

		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------  *  -------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j)
					System.out.print("*");
				else {
				}

			}
			System.out.println();
		}
		System.out.println("------    -------");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j <= n - 1)
					System.out.print("*");
				else {
				}

			}
			System.out.println();
		}
		System.out.println("------    -------");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			int a = 97;
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.printf("%c",  a);
				if (k < (2 * i + 1) / 2)
					a++;
				else {
					a--;
				}
			}
			System.out.println();
		}
		
		System.out.println("------    -------");

		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			int a = 1;
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print(""+
			a);
				if (k < (2 * i + 1) / 2)
					a++;
				else {
					a--;
				}
			}
			System.out.println();
		}
		
		System.out.println("------    -------");

		for(int i=1;i<n;i++) {
//			n=7;
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		int no=1;
		for(int i=1;i<n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(no++);
			}
			System.out.println();
		}
		

	}
}
