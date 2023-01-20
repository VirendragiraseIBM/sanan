package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail {
	@Test
	public void TC1() {
		Reporter.log("running TC1",true);//verification1
		Assert.fail();//Intentionally TC1 is failed
		System.out.println("I am after failing Tc1");//verification2
		
	}
		
	@Test
	public void TC2() {
		Reporter.log("running TC2",true);//verification1
	}
	}
	
