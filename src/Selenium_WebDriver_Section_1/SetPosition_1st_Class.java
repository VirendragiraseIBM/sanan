package Selenium_WebDriver_Section_1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_1st_Class {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.linkedin.com/");
	//create object on point class
	Point p=new Point(200,100);
	//Set Size Method
	driver.manage().window().setPosition(p);
}
}
