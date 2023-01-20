package Robot_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_1s_Class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application 
		driver.get("https://www.myntra.com/");
		//create object of Robot Class
		Robot r=new Robot();
		 //Key Press
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//Key Release
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//Key Press
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//Key Release
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);


}
}