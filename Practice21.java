package javaClass2;

import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = s1.next();
        String reverse ="";
        for(int i = a.length()-1;i>=0;i--)
        {
            char m = a.charAt(i);
            reverse = reverse+m;
        }
        System.out.println(reverse);
       
        if(a.equals(reverse))
        {
        System.out.println("They are pallindrome");
        }
        else
        {
        System.out.println("They are not pallindrome");
        }
	}

}
