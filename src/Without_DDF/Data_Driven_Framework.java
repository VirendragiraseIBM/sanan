package Without_DDF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Driven_Framework {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		//implicitly wait
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demo.actitime.com/login.do");
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER );
       String  expT="actiTIME - Login";
       String actT=driver.getTitle();
       if(actT.equals(expT)) {
       System.out.println("TC is Pass");
	}
       else {
    	   System.out.println("Tc is Fail");
       }

}
}