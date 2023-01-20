package Selenium_WebDriver_Section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {
	public static void main(String[] args) {
		//Set The Properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//Enter Username
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		//enetr Password
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	}

}
