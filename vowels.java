import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		
		
//		String a="Education";
//		int no=0;
//		for(int i=0;i<=a.length()-1;i++) {
//			char b=a.toLowerCase().charAt(i);
//			if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
//				no++;
//			}
//
//		}
//		System.out.println("String contains "+no+" vowels");
		
//		for dynamic responses
		
			Scanner sc=new Scanner(System.in);
			String a;
			while(true) {
				int no = 0;
				System.out.println("Enter the String the need to be counted its vowels for/ exit the option :");
				a=sc.nextLine().toLowerCase();
				if(a.equalsIgnoreCase("Exit")) {
					System.out.println("thank you.?");
					break;
				}
				for(int i=0;i<=a.length()-1;i++) {
					char b=a.charAt(i);
					if (b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
						no++;	
					}
					
				}
				System.out.print("The sentence contains "+no+" vowel in it. ");
			}
			
	}
}
