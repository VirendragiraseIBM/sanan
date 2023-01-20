package Selenium_WebDriver_Section_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_2nd_Class {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	String Viren=driver.getTitle();
	System.out.println(Viren);
	//test data
	String expT="MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
	String actT=driver.getTitle();
	if(expT.equals(actT)) {
	System.out.println("TC is Pass");
	}
	else {
		System.out.println("TC is fail");
	}
	
	}

}