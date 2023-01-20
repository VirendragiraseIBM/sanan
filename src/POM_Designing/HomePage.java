package POM_Designing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	public HomePage(WebDriver driver) {
		
	}
	public void VerifyText() {
		String expT="Enter Time-Track";
		String actT=text.getText();
		if(actT.equals(expT)) {
			System.out.println("TC is Pass");
		}
		else {
			System.out.println("TC is Fail");
		}
	}
}

