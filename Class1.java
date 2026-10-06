package javaClass2;
interface i1
{
	void login();
}
interface i2
{
	void login1();
}

abstract class Class2 implements i1,i2
{
	abstract void method1();
	public static void main(String[] args)
	{

	}

}
public class Class1 extends Class2
{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}
	
}