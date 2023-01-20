package Selenium_Section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Handling {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Open The Application
		driver.get("https://en-gb.facebook.com/");
		//Click On Create New Account Button
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//Enter First Name 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Virendra");
		//Enter Surname 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Girase");
		//Enter Email Address
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Virendragirase23@gmail.com");
		//Re-enter Email address
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Virendragirase23@gmail.com");
		//Enter Password
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Vaibhav@77");
		//select Day listbox
		Thread.sleep(4000);
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		//Create Object Of Select Class
		Select s=new Select(day);
		Thread.sleep(4000);
		//Use Select Class Method 
		s.selectByValue("2");
		//Select Month ListBox
		Thread.sleep(4000);
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		//Craete Object Of Select Class 
		Thread.sleep(4000);
		Select S=new Select(Month);
		S.selectByValue("9");
		//Select Year ListBox 
		Thread.sleep(4000);
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		//Create Object Of Select Class
		Select V=new Select(year);
		V.selectByValue("1994");
		//Click On Gender Button
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//Click On Sigh Up Button 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		
		
	}

}
