package co.string;

public class NewString {
public static void main(String[] args) {
	
	String s="He is a very very  good boy, isn't he?";
    String rev=new StringBuffer(s).reverse().toString();
	System.out.println("Rev::"+rev);
	String []str=s.split(" [^A-Za-z]+ ");
    String[] str1 = s.split("['?//s	]");

    System.out.println("len::"+str1.length);
    System.out.println("len::"+str.length);
    int i;
    for( i=0;i<str1.length-1; i++);
    System.out.println(str1[i]);
   System.out.println("k");
}
}
