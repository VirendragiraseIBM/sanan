package POM_Designing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//call 1st pom class
		LoginPage l=new LoginPage(driver);
		l.enterun();
		l.enterpwd();
		l.ClickLoginButton();
		//call 2nd pom class
		HomePage h=new HomePage(driver);
		h.VerifyText();

	}

}
