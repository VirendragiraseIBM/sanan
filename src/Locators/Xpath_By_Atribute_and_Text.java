package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Atribute_and_Text {
public static void main(String[] args) {
	//Set The Properties
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			//Enter Username
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
			//Enter Password
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			//Click On Login Button
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			//VErify User Should be Navigate to Home Page
			String expectedT="actiTIME - Login";
			String actualT=driver.getTitle();
			System.out.println(actualT);
			
			if(expectedT.equals(actualT)) {
			System.out.println("TC is Pass");
       }
			else {
				System.out.println("TC is Fail");
			}
              


}
}
