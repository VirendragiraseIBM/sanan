package Selenium_WebDriver_Section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {
	public static void main(String[] args) {
		//Set The Properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		//enter Username
		driver.findElement(By.id("userid")).sendKeys("DPG458");
		//enter Password
		driver.findElement(By.id("password")).sendKeys("Amol@1234");
		
	}

}
