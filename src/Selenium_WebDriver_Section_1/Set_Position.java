package Selenium_WebDriver_Section_1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Position {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		//create object of point class
		Point p=new Point(300, 400);
		//use SetSize Method
		driver.manage().window().setPosition(p);
	}

}
