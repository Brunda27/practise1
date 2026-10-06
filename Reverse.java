package javaClass2;

public class Reverse {

	public static void main(String[] args)
	{
		String a = "done";//length = 4
		String reverse = "";
		for(int i =a.length()-1;i>=0;i--)
		{
		char m  = a.charAt(i);
		reverse = reverse+m;
		}
		System.out.println("The reverse of the string "+ a + " is  " +reverse );

		if(reverse.equals(a))
		{
			System.out.println("it is pallindrome");
		}
		else
		{
			{
				System.out.println("it is not a pallindrome");
			}
		}
	}

}
