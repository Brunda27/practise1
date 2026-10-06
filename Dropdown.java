package javaClass2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.com");
		List<WebElement> list= driver.findElements(By.xpath("//select[@aria-describedby='searchDropdownDescription']/child::option"));

		int count= list.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
		WebElement e2= list.get(i);
		String text= e2.getText();
		System.out.println(text);
		}
	}

}
