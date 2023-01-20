package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
	@Test
	public void TC1() {
		Reporter.log("I ts my first program in Test ng",true);
	}
	@Test(timeOut = 60000)
	public void TC2() {
		Reporter.log("I ts my second program in Test ng",true);
		


}
}