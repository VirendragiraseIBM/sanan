package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_Screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the app
		driver.get("https://www.amazon.in/");
		//take the xpath of an element
		WebElement abc= driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		//use getscrrenshot method
		File src=abc.getScreenshotAs(OutputType.FILE);
		//create object of file class
		File dest=new File("C:\\Users\\sai\\Desktop\\17Sep Screenshot\\particular.jpg");
		//use copy method
		Files.copy(src, dest);






}
}