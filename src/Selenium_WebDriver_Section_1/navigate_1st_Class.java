package Selenium_WebDriver_Section_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_1st_Class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://wss.mahadiscom.in/wss/wss_view_pay_bill.aspx");
		Thread.sleep(5000);
		driver.navigate().to("https://www.myntra.com/");
		//Backward
		driver.navigate().back();
		//Forward
		driver.navigate().forward();
		//Refresh The Browser
		driver.navigate().refresh();
		
	}

}
