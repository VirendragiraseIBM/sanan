package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Not_equals {
	@Test
	public void M1() {
		Reporter.log("running m1()",true);
		String expT="Hi";
		String actT="Hello";
		//using aseer class method
		Assert.assertNotEquals(expT,actT);
	}

}
