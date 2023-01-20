package Selenium_WebDriver_Section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_1st_Class {
		public static void main(String[] args) {
			//Set The Properties
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Virendragirase23@gmail.com");
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Vaibhav77");
}
}
