package Selenium_WebDriver_Section_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURL_1st_Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cetcell.mahacet.org/");
		//getCurrentURL Method
		String link=driver.getCurrentUrl();
		System.out.println(link);
	}

}
