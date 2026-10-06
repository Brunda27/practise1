package Extra_examples;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
      String a = "cat";
      String b ="act";
      if(a.length()==b.length())
      {
    	  char[] c1 =a.toCharArray();
    	  char[] c2 =b.toCharArray();
    	  Arrays.sort(c1);
    	  Arrays.sort(c2);
    	  boolean b1 = Arrays.equals(c1, c2);
    	  if(b1==true)
    	  {
    		  System.out.println("They are anagram");
    	  }
    	  else
    	  {
    		  System.out.println("they are not anagram");
    	  }
      }
      else
      {
    	  System.out.println("They are not anagram as the lengths are not equal");
      }
	}

}
