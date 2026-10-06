package Extra_examples;


public class Viva1 
{

	public static void main(String[] args)
	{
	  String a = "mom";
	  String reverse ="";
	  for(int i = a.length()-1 ;i>=0 ;i--)
	  {
		  char c = a.charAt(i);
		  reverse = reverse +c;
	  }
	  
    if(reverse.equals(a))
    {
    	System.out.println("they are palindrome");
    }
    else
    {
    	System.out.println("they are not palindrome");
    }
	}

}
