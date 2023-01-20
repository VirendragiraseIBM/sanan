package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test (priority= 3)
	public void TC1() {
		Reporter.log("Running Test Case 1",true);
}
	@Test (priority= 1) 
	public void TC2() {
		Reporter.log("Running Test Case 2",true);
	}
	@Test (priority= 2)
	public void TC3 () {
		Reporter.log("Running Test Case 3",true);
	}
}