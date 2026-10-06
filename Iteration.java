package Extra_examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iteration
{

	public static void main(String[] args) 
	{
     Collection<String> c1 = new ArrayList<String>();
     c1.add("abc");
     c1.add("def");
     c1.add("ghi");
     c1.add("jkl");
     
     Iterator<String> i2 = c1.iterator();
     while(i2.hasNext())
     	{
    	 	System.out.println(i2.next());
     	}
 
	}

}
