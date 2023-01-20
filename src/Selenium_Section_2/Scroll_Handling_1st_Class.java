package Selenium_Section_2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Handling_1st_Class {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open the application 
	driver.get("https://www.meesho.com/");
	//use Java Script Executor
	Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2500)");
	Thread.sleep(4000);
	jse.executeScript("window.scrollBy(0,2000)");
	Thread.sleep(4000);
	jse.executeScript("window.scrollBy(0,-1000)");

}
}
