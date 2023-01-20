package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	//choose the terget element
	WebElement Action = driver.findElement(By.xpath("//a[text()='Gmail']"));
	//create object of Actions class
	Actions act=new Actions(driver);
	//use movetoelement method
	act.moveToElement(Action).perform();
	//right click on target element
		act.contextClick(Action).perform();
		//leftclick(click)
		act.click(Action);
		//double click  
		act.moveToElement(Action).doubleClick().perform();

	




	




}
}