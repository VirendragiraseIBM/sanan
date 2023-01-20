package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test 
	public void TC1 () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		//implicitly wait
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demo.actitime.com/login.do");
       Reporter.log("Hii TestNG i am Devil",true);
	}

}
