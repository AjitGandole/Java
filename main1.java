package number;

import java.util.Scanner;

public class main1 {
					
	
	public static void oddEven(int num) {
		if(num%2==0) {
			System.out.println(num+" is Even");
		}else {
			System.out.println(num+" is odd");	
		}	
	}
	
	public static boolean isPrime(int num) {
		if (num<=1) {
			return false;
		}
		for(int i=2;i<num/2;i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
		}
	
	
	public static int isFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		
		return fact;
	}
	
	public static void fibonacci(int num) {
		int first=0 , second=1 ,next;
		System.out.print("The Fibnonacci Series of "+num+" is");
		
		for(int i=0;i<=num;i++) {
			System.out.println("The Fibnocci of range "+num+" is:"+first);
			next=second+first;
			
			first=second;
			second=next;
			
		}
		
	
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
			if(a>0) {
				    oddEven(a);	
			}else {	
			System.out.println("Number 0 is Invalid");
			}
			
			
		 if(isPrime(a)) {
				System.out.println("The "+a+" is: Prime number");
				}else {
				System.out.println("The "+a+" is: Not a Prime number ");
				 }
		 
		 System.out.println("The factorial of "+a+" is "+isFactorial(a) );
		 
		 fibonacci(a);
		
		sc.close();
	}

}
