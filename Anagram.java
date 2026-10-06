package javaClass2;

import java.util.Arrays;

/*1.check if the lengths of the strings are equal 
 *2.string convert array of characters
 * 3.sort both the arrays
 * 4.equal method
 * */
 
public class Anagram {

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
		/*String a ="teach";
		String b = "cheam";
		if(a.length()==b.length())
		{
		char[] c1 = a.toCharArray();
		System.out.println("coverting string a into array" + Arrays.toString(c1));//[t,e,a,c,h]
		char[] c2 = b.toCharArray();
		System.out.println("coverting string b into array" + Arrays.toString(c2));//[t,e,a,c,h]
		Arrays.sort(c1);
		System.out.println("After sorting c1 array is" + Arrays.toString(c1));
		Arrays.sort(c2);
		System.out.println("After sorting c1 array is" + Arrays.toString(c2));
		boolean b1 = Arrays.equals(c1, c2);
		if(b1==true)
		{
			System.out.println("They are anagram");
		}
		else
		{
			System.out.println("They are not anagram");
		}
		}
		else
		{
			System.out.println("length of the both strings are different hence they are not anagram");

		}*/
		
	}

}
