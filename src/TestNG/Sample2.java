package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void TC4() {
	Reporter.log("Running Test Case 4",true);	
	}
	
	@Test
	public void TC5() { 
		Reporter.log("Running Test Case 5",true);
	}
	
	@Test
	public void TC6() {
		Reporter.log("Running Test Case 6",true);

}
}