import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		String a,b;
		Scanner s=new Scanner(System.in);
		
		while(true) {
		 System.out.println("Enter the words that maybe anagrams/Exit: ");
		 System.out.println("Enter String s1: ");
		 a=s.nextLine().toLowerCase();                           // converting string to lower case
		 System.out.println("Enter String s2: ");
		 b=s.nextLine().toLowerCase();
		 
		 if((a).equalsIgnoreCase("Exit")||(b).equalsIgnoreCase("Exit")) {
			 break;
		 }
		 
		 if(a.length()==b.length()) {
			 
			 	char[] a1=a.toCharArray();
			 	char[] b1=b.toCharArray();
			 	
			 	Arrays.sort(a1);
			 	Arrays.sort(b1);
			 	
			 	String a11=new String(a1);
			 	String a22=new String(b1);
			 	
			 	if(a11.contains(a22)) {
			 		System.out.println("String is anagram");
			 	}else {
			 		 System.out.println("Strings are not anagrams");
			 	}
		 }else {
			 System.out.println("Strings are not anagrams");
		 }
		}
	}
}
