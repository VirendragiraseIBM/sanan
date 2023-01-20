package Selenium_Section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_1st_Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application 
		driver.get("https://kite.zerodha.com/");
		//open application using Keys class
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("OY8289",Keys.TAB,"Vaibhav@77",Keys.ENTER);
}
}