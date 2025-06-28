package tric;

public class staticmain {

	static public void main(String[] args) {  // only sattic is at start
		System.out.println("hello");
		main();
	}
	
	 public static void main() {  // over load main method
		System.out.println("hello from main");
	}
	 
	 
}
