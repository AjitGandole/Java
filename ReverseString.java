package dmeo;

public class ReverseString {
    // method 1 : using String Buffer and Reverse()
	public static void reverse1(String str){
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
	}
	
	// method 2 : using looping method
	public static void reverse2(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println("looping type "+rev);
	}
	
	
	
	
	
	public static void main(String[] args) {
		  String str="Hello World";
		  ReverseString.reverse1(str);
		  ReverseString.reverse2(str);
		  

	}

}
