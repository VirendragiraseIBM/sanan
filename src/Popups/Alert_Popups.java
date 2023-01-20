package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    //enter customer id
	    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12354");
	    //Click on Submit Button
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    //first of all we need to switch the control of selenium from webpage to popup
	  Alert  alt=driver.switchTo().alert();
	 // alt.accept();
	 // alt.dismiss();
	  String text = alt.getText();
	  System.out.println(text);


	}

}
