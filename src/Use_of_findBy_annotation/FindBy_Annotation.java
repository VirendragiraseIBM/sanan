package Use_of_findBy_annotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBy_Annotation {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	driver.get("https://demo.actitime.com/login.do");
	//enter username
	WebElement Un = driver.findElement(By.xpath("//input[@id='username']"));
	//Refresh The page 
	driver.navigate().refresh();
	//write propper username
	Un.sendKeys("admin");
	


}
}