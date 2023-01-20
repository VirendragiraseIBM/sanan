package Selenium_Section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_3rd_Class {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open the application 
	driver.get("https://outlook.office.com/owa/?path=%2Fmail%2Finbox&realm=k12.nd.us");
	//open application using Keys class
	driver.findElement(By.xpath("//input[@id='userNameInput']")).sendKeys("virendragirase23@gmail.com",Keys.TAB,"Vaibhav@77",Keys.ENTER);
}
}
