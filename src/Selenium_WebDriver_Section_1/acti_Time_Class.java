package Selenium_WebDriver_Section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class acti_Time_Class {
	public static void main(String[] args) {
		//Set The Property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//Enter Username
		driver.findElement(By.name("username")).sendKeys("admin");
		//Enter Password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login Button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		
	
	}

}
