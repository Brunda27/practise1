package javaClass2;

public class Stringfunctions 
{
	 String a = "one";
	public static void main(String[] args) 
	{
		String a = "two";
		System.out.println(a); 
		Stringfunctions s1 = new Stringfunctions();
		System.out.println(s1.a);
		
		String c = "good day";//string pool area ---address is 13
		String d = "good day"; //address is 13
		String e = "good day"; //address is 13
		String b1 = new String("good day");//heap memeory address is 16
		String b2 = new String("good day");//heap memeory address is 17

	}

}
