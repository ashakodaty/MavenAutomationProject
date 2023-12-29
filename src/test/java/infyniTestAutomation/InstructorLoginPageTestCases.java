package infyniTestAutomation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import infyniTestAutomation.pageobjects.InstructorLoginPage;

public class InstructorLoginPageTestCases extends InstructorLoginPage {

	

	@Test(priority = 1)
	public static void loginAsInstructor() throws Exception {
		clickLoginButton();
		// Enter Email address
		enterEmailId("instructor44@mailinator.com");
		// Enter password
		enterPwd("start123");
		// Click 'Sign In' button
		clickSignInButton();
		// Instructor Logout profile select
		verifyprofileimg();
		profileimageclick();
		// Drop down select
		verifyLogoutDD();
		LogoutDDSelect();
		LogoutDDclick();
		clickHomeLink();

	}

	

}
