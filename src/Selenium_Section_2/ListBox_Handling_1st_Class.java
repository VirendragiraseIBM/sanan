package Selenium_Section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox_Handling_1st_Class {
public static void main(String[] args)throws Throwable  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//Open The Application
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB ,"manager",Keys.ENTER );
	
	
}
}
