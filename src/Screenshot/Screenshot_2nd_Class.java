package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_2nd_Class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		//Typecast TakesScreenshot
		Thread.sleep(8000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		//Take The Screenshot Using getScreenshot Method
		File src = ts.getScreenshotAs(OutputType.FILE);
		//Create The Object Of File Class
		File dest=new File("C:\\Users\\sai\\Desktop\\17Sep Screenshot\\IRCTC.jpg");
		//We Need Convert Screenshot From src to destinstion 
		Files.copy(src, dest);
	}

}
