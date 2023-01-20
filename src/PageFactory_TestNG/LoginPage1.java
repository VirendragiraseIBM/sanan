package PageFactory_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	@FindBy(xpath = "//input[@id='username']")private WebElement UN;
	@FindBy(xpath = "//input[@type='password']")private WebElement PWD;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement loginBTN;
	
	//initialization
	public void loginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUN(String Username) {
		UN.sendKeys(Username);	
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickloginBtn() {
		loginBTN.click();
	}

}
