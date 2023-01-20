package Selenium_WebDriver_Section_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_1st_Class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the Browser
		driver.get("https://www.cricbuzz.com/");
		//Maximize
		driver.manage().window().maximize();
		//java wait
		Thread.sleep(10000);
		//Minimize
		driver.manage().window().minimize();
		
	}

}
