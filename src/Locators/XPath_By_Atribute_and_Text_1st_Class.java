package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_By_Atribute_and_Text_1st_Class {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.goibibo.com/accounts/login/?next=/");
	//Enter Username
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("virendragirase23@gmail.com");
	//Enter Password
	driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Vaibhav@77");
	
}
}
