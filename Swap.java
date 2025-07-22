package Swapping;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// swapping using temp variable 
		Scanner sc=new Scanner(System.in);
		System.out.println("write vale of a ");
			int a=sc.nextInt();
			System.out.println("wreite value of b ");
			int b=sc.nextInt();
//			int temp=a;
//			a=b;
//			b=temp;
//			System.out.println("a: "+a);
//			System.out.println("b: "+b);
			
		// swapping without using temp variable
			
			a=a+b; //a=30
			b=a-b; //b=10
			a=a-b; //a=20
			System.out.println("a: "+a);
			System.out.println("b: "+b);
		
			
			
	}

}
