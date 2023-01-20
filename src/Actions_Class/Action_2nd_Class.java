package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_2nd_Class {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	//choose the terget element
	WebElement Target = driver.findElement(By.xpath("//a[text()='Gmail']"));
	//create object of Actions class
	Actions act=new Actions(driver);
	//all method in single step using build methodand perform method
	act.moveToElement(Target).contextClick().doubleClick().perform();




	}

}
