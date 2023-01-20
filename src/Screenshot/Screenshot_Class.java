package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_Class {
	public static void main(String[] args)throws Throwable  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the app
		driver.get("https://www.flipkart.com/");
		//typecast takessceenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		//take the scrreenshot using getscreenshot method
		File src=ts.getScreenshotAs(OutputType.FILE);
		//create the object of file class
		File dest=new File("\\\\DESKTOP-JJIKP98\\Users\\sai\\Desktop\\17Sep Screenshot\\Flipkart.jpg");
		//we need convert screenshot from src to destination
		Files.copy(src, dest);



	}

}
