package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	@Test (invocationCount=7)
	public void TestCase() {
		Reporter.log("Running Test Case",true);
		
	}

}
