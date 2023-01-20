package Selenium_WebDriver_Section_1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Flipkart.com");
		//create object of Dimension Class
		Dimension d=new Dimension(200, 100);
		//use the StSize Method
		driver.manage().window().setSize(d);
}

}
