package javaClass2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = s1.nextInt();
		System.out.println("enter the value of b");
		int b = s1.nextInt();
		int sum = a+b ;
		System.out.println("the sum is " + sum);
		
		s1.close();
	}

}
