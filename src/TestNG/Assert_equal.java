package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equal {
	@Test
	public void TC1() {
		Reporter.log("running TC1()",true);
		String expT="Hi";
		String actT="Hi";
		//using aseer class method
		Assert.assertEquals(expT,actT);
	}

	}


