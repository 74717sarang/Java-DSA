package co.string;

public class count {

	
	public static void main(String[] args) {

		String str = "Wwel wel wel";
		
		char[]arr=str.toCharArray();
		
		int[]frq=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			frq[i]=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					frq[i]++;
					arr[j]='\0';
				}
			}
			if(arr[i]!='\0')
			System.out.println(arr[i]+" count "+frq[i]);
			
		}
	}
}
