package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vaibhav {
	@Test
	public void tC1() {
		Reporter.log("Running Login Page",true);
	}
    @Test
    public void TC2() {
    	Reporter.log("Running Home Page",true);
    }
    @Test
    public void TC3() {
    	Reporter.log("Running Payment Page",true);
    	
}
}