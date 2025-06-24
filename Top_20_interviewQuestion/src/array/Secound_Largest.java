package array;

public class Secound_Largest {

	private static int brute_force(int[] arr) {

		// we can direct use sort() over array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr[arr.length - 2];
	}

	private static int advance(int[] arr) {

		int large = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large) {
				secondLarge = large;
				large = arr[i];

			} else if (arr[i] < large && arr[i] > secondLarge) {
				secondLarge = arr[i];
			}

		}
		return secondLarge;
	}

	
	public static  int thirdLarge(int []arr) {
		
		int large=arr[0];             // set first is large
		int secondlarge = arr[0],th=arr[0];         //set first is secondlarge 
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				th=secondlarge;
				secondlarge=large;
				large=arr[i];
				
			}
			else if(arr[i]<large && arr[i]>secondlarge) {
				th=secondlarge;
				secondlarge=arr[i];
			}
		}
		return th;
	}
	
	
	static public  int secondMin(int arr[]) {
		int min=arr[1];
		int secondmin=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondmin=min;
				min=arr[i];
			}
			else if(arr[i]<secondmin  && arr[i]>min)	{
				secondmin=arr[i];
			}
		}
      return secondmin;
	}
	
	static public  void main(String[] args) {

		int[] arr = { 1, 5, 39, 6, 9, 35, 99 };

		System.out.println("Brute_force");
		System.out.println(brute_force(arr));
		System.out.println("Advance");
		System.out.println(advance(arr));
		System.out.println("new fun thirdLarge");
		System.out.println(thirdLarge(arr));

		System.out.println("new fun secondMin");
		System.out.println(secondMin(arr));
	}

}
