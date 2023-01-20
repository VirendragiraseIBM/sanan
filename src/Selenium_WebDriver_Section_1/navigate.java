package Selenium_WebDriver_Section_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.navigate().to("https://www.Google.com");
		//Backword
		driver.navigate().back();
		//Forword
		driver.navigate().forward();
		//Refresh the Browser
		driver.navigate().refresh();
		
		
	}

}
