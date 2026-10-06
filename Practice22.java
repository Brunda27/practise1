package javaClass2;

import java.util.Arrays;

public class Practice22 {

	public static void main(String[] args) 
	{
		String a = "good";
		String b = "both";
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		if(Arrays.equals(b1, a1))
		{
			System.out.println("they are anagram");
		}
		else
		{
			System.out.println("they are not anagram");
		}	
	}

}
