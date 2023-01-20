package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test 
	public void TC1() {
		Reporter.log("It's my first TestNG Program",true);
	}
	@Test 
	public void TC2() {
		Reporter.log("It's My Second TestNG Program in",true);
		Assert.fail();
	}

}
