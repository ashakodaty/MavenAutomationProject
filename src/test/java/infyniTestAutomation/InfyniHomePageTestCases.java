package infyniTestAutomation;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import infyniTestAutomation.pageobjects.InfyniHomePage;

public class InfyniHomePageTestCases extends InfyniHomePage {
	
	@BeforeSuite
	public static void lauchApplication() {
		launchBrowser("Chrome");
		launchApp("http://dev.infyni.com/");
		implicitWait(10);
	}

	@Test(priority=1)
	public static void redirectToLoginPage() {
			
		clickLoginButton();
		System.out.println("Navigated to LoginPage");
		
		 //Validating If Login text is displayed or not
		  
		boolean actualresult =loginTextPresence();
		boolean expectedresult = true;
		  SoftAssert sa=new SoftAssert();
		  sa.assertEquals(actualresult,expectedresult);//using soft assert sa.assertAll();
		  System.out.println("Login Text Presence Validation Success");
	 
	}
	
	/*
	 * //@AfterSuite public static void closeApplication() { closeApp(); }
	 */
	
}
