package javaClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();			
		driver.get("https://www.Amazon.in");
		Thread.sleep(10000);
		
		WebElement dropdown=	driver.findElement(By.xpath("//select[@name='url']"));
		
		Select s1=new Select(dropdown);
		s1.selectByIndex(1);
		//s1.selectByVisibleText("Alexa Skills");
	}

}
