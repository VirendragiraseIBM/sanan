package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Annotation {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open Browser",true);
	}
	@BeforeMethod
	public void Beforemethod() {
		Reporter.log("login to Application",true);
	}
	@Test
	public void verifyText() {
		Reporter.log("verify Actual Test Case",true);
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout to Application",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("Close the Browser",true);
	}

}
