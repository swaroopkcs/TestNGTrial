package testNGTrial;

import java.util.concurrent.PriorityBlockingQueue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTrialAssignment {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Take a bath berfore next session.");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Do some practice");
	}
	
	@Test
	public void beforeOpeningApp() {
		System.out.println("Double click to open the application");
	}
	
	
	@Test (priority = 2)
	public void openBrowser() {
		System.out.println("Open the web Browser");
		Assert.fail();
	}
	
	@Test (priority = 3, dependsOnMethods = "openBrowser")
	public void openWhatsapp() {
		System.out.println("Open whatsapp to get the link");
	}
	
	@Test (priority = 1)
	public void openEclipse() {
		System.out.println("Open Eclipse and get it ready");
	}
	
	@Test (priority = 4)
	public void openNotes() {
		System.out.println("Open Notes and have it ready");
	}
	
	@AfterMethod
	public void systemOpening() {
		System.out.println("Wait for the system to open");
	}

}
