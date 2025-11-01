import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // user inputs
		int i=0;
//		if(i>=0) {
//			System.out.println("Enter a String Value");
//			String a=sc.nextLine();
//			String b=palindromeChecker(a);
//			if(a.equalsIgnoreCase(b)) {
//				System.out.println("String a is "+a+" is palindrome of "+ b);
//
//		}else {
//			System.out.println("String a is "+a+" is not a palindrome of "+ b);
//		}
//			i++;
//		}
// palindrome using while loop
		
		
		String a = null;
		
		while(true) {
			System.out.println("Enter a String Value/Exit to stop this :");
			a=sc.nextLine();
			if(a.equalsIgnoreCase("Exit")) {
			System.out.println("The program stooped thanks.?? at "+i+" times");
			break;
			}
		
		String b=palindromeChecker(a);
		if(a.equalsIgnoreCase(b)) {
		System.out.println("String a is "+a+" is palindrome of "+ b);

		}else {
			System.out.println("String a is "+a+" is not a palindrome of "+ b);
		}
		i++;
	}
	}
	
	public static String palindromeChecker(String a) { 
		return new StringBuilder(a).reverse().toString();
	}
}
