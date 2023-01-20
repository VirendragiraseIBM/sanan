package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		//implicitly wait
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.myntra.com/");
		Reporter.log("first time login to myntra shopping",true);
	}
	public void TC2() {
		Reporter.log(" am virendra girase",true);
	}
	public void TC3() {
		Reporter.log("Pass The Msg To Console",true);
	}
}
