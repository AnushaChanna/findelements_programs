package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A174_C54_PrintAllAutoSuggestions
{
public static void main(String[] args) 
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Smart Watches");
	
	List<WebElement> e2=driver.findElements(By.xpath("//input[@class='nav-input nav-progressive-attribute']/form/div"));
	for (int i=0 ; i<e2.size();i++)
	{
		WebElement e3=e2.get(i);
		System.out.println(e3.getText());
	}
}
	
	
	
	
	
	
}
