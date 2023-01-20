package Selenium_WebDriver_Section_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_1st_Class {
	public static void main(String[] args) throws Throwable  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get method
		driver.get("https://www.naukri.com/");
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(300, 200);
		//close method
		driver.close();
		driver.get("https://www.naukri.com/");
		Options opt=driver.manage();
		Window win=opt.window();
		win.maximize();
	}

}
