package Selenium_WebDriver_Section_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the browser
		driver.get("http://www.monsterindia.com/");
		//maximize the browser
		driver.manage().window().maximize();
		//java wait
		Thread.sleep(15000);
		//minimize
		driver.manage().window().minimize();
		
	}

}
