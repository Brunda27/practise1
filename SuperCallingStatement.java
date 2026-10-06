package javaClass2;
class v1
{
	v1()
	{
		System.out.println("Constructor 1");
	}
}
class v2 extends v1
{
	v2()
	{
		System.out.println("Constructor 2");
	}
}
class v3 extends v2
{
	v3()
	{
		System.out.println("Constructor 3");
	}
}

public class SuperCallingStatement
{

	public static void main(String[] args) 
	{
		v3 m1 = new v3();
	}

}
