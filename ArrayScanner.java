package javaClass2;

import java.util.Scanner;

public class ArrayScanner 
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		String [] s4 = new String[s1.nextInt()];
		for(int i = 0;i<s4.length;i++)
		{
			System.out.println("Please enter the string at index " + i);
			s4[i]=s1.next();
		}
	}
}
