package TestNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void TC1() {
	Reporter.log("Running Test Case 1",true);	
	}
	
	@Test
	public void TC2() { 
		Reporter.log("Running Test Case 2",true);
	}
	
	@Test
	public void TC3() {
		Reporter.log("Running Test Case 3",true);
	}
	
}
