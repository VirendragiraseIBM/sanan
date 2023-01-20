package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup {
	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c .addArguments("---disable--notifications");
		c .addArguments("Start-Maximized");
		 //Open Browser
		   WebDriver driver=new ChromeDriver(c);
		   Thread.sleep(12000);
		driver.manage().window().maximize();
		   driver.get("https://www.flipkart.com/");

}
}