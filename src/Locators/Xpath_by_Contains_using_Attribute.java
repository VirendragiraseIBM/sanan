package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Contains_using_Attribute {
	public static void main(String[] args) {
		//Set The Properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//Enter Username
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		//Enter Password
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("manager");
		//Click On Login Button
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	}

}
