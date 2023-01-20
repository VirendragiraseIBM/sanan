package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_1st_Screenshot {
	
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//take the Xpath of that Element
		WebElement abc= driver.findElement(By.xpath("//img[@class='image-image undefined image-hand']"));
		//Use getScreenshot Method
		File src=abc.getScreenshotAs(OutputType.FILE);
		//Create Object Of This File 
		File dest=new File("C:\\Users\\sai\\Desktop\\17Sep Screenshot\\Myntra.jpg");
		//Use Copy Method 
		Files.copy(src, dest);
	  system.out.println("commnets from Github by Team Leader")
		
	
		
	}

}
