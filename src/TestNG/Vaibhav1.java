package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vaibhav1 {
	@Test
	public void TC3(){
		Reporter.log("Running Main App",true);	
	}
	@Test
	public void TC4() {
		Reporter.log("Running Shopping App",true);
	}
	@Test
	public void TC5() {
		Reporter.log("Ruuning First Page",true);
	}

}
