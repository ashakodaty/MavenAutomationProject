package infyniTestAutomation.pageobjects;




import org.openqa.selenium.By;

import infyniTestAutomation.base.Base;

public class InstructorLoginPage extends Base{
	
//Common Login Button Home page Objects	
public static By loginButton = By.xpath("(//li/a[@href='/login/'])[1]");
public static By loginText=By.xpath("//p[contains(text(),'Login to your account')]");
	
//Login objects for instructor 	page
public static By emailInput = By.xpath("//div/input[@id='account_l']");
public static By passwordInput = By.xpath("//div/input[@id='password_l']");
public static By homeLink = By.xpath("//a[contains(text(),'Home')]"); // action click
public static By signinButton = By.xpath("//div/button[@class='butn style-one red btn-block mt-4 mb-2']");
	
public static By SecondpageImaage = By.xpath("//div[@class='logo-navbar__cucumber-studio-logo']");	
//logout Objects for instructor page 
public static By logoutProfilePic = By .xpath(
	  "//img[@src='https://infyni-dev0.s3.amazonaws.com/media/image/2021/12/teacher-icon-male-person-with-book-and-pointer-vector-19974957_1wyvWsI.jpg']"
	  ); 
public static By logoutDDButtonSelect = By.xpath("//div/a[@href='/logout/']");
//common methods---------Method -1

	 public static void clickLoginButton() 
	 {
		try 
		{
		driver.findElement(loginButton).click();
		} 
		catch (Exception e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 System.out.println("'Log In' button on infyni homepage is clicked"); 
	  }
	 
//Method -2
	 
	  public static boolean loginTextPresence()
	  {
		 boolean result=false;
		 try 
		 {
		 driver.findElement(loginText).isDisplayed();
		 } 
		 catch (Exception e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		 return result;
		}
//Method 1			
		public static void clickHomeLink() 
		{
		try
      {
		driver.findElement(homeLink).click();
		} 
		catch (Exception e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}	
// Method to enter email address

public static void enterEmailId(String email) {
	try {
		driver.findElement(emailInput).clear();
		driver.findElement(emailInput).sendKeys(email);
		System.out.println("Email Id entered");
	} catch (Exception e) {
		e.printStackTrace();
	}
}

// Method to enter password
public static void enterPwd(String password) {
	try {

		driver.findElement(passwordInput).clear();
		driver.findElement(passwordInput).sendKeys(password);
		System.out.println("Password entered");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

// Method to click 'Sign In' button
public static void clickSignInButton() {
	try {
		driver.findElement(signinButton).click();
		System.out.println("Sign In button is clicked");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
// logout image Selected

public static void profileimageclick() {
	try {
		driver.findElement(logoutProfilePic).click();
		System.out.println("Profile image is clicked");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Logout pic image verified");
}

// Validating Image on second Page left corner upside

public static void verifyprofileimg() {

	try {
		driver.findElement(logoutProfilePic).isDisplayed();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Validating profile image right corner of Instructor page ");
}
// validating Logout image

public static void verifyLogoutDD() {
	try {
		driver.findElement(logoutDDButtonSelect).isDisplayed();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Profile Image is displayed ");
}
// Logout select

public static void LogoutDDclick() {
	try {
		driver.findElement(logoutDDButtonSelect).click();
		System.out.println("Logout drop down is clicked ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
// Validating logout select button is selected

public static void LogoutDDSelect() {
	try {
		driver.findElement(logoutDDButtonSelect).isSelected();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Logout Drop down is Selected");
}

}
