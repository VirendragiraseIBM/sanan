package Selenium_Section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_4th_Class {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application 
		driver.get("https://webmail.suzlon.com/owa/auth/logon.aspx");
		//open application using Keys class
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Suzlon/38178",Keys.TAB ,"Vaibhav@17",Keys.ENTER );

}
}