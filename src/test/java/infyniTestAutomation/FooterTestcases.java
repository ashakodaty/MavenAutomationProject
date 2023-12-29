package infyniTestAutomation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import infyniTestAutomation.pageobjects.InfyniHomePage;

public class FooterTestcases extends InfyniHomePage{
	@BeforeSuite
	public static void lauchApplication()
	{
		launchBrowser("Chrome");
		launchApp("http://dev.infyni.com/");
		implicitWait(10);
	}


//TC-01---Directing to About Us link
	
	@Test(priority=2)
	public static void redirectToAboutUsPage()
	{
		clickAboutUsLink();
		System.out.println("Navigated to About Us Page");
		//Validating If AboutUs text is displayed or not		
		boolean actualresult = aboutUsTextPresence();
		boolean expectedresult = true;
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualresult, expectedresult);//using soft assert
		sa.assertAll();
		System.out.println("About Us Text Presence Validation Success");
		
		// Retrieving the value of the text to verify/validate		
		 String actualText = aboutUsText();
		 String expectedText = "About Us";
		 sa.assertEquals(actualText, expectedText);
		 sa.assertAll();
		 System.out.println("ActualText:" +actualText);
		 System.out.println(" Retrived the Value of the About Us Text Successfully");
		 System.out.println(" TC-1 About us link test case ");	
		 clickHomeLink();
		 System.out.println("Navigated back to Home page from About Us Link");
	}
	
// TC-02--  Directing to Contact Us link    
//verification of contact us page 	
	@Test(priority = 3)
	public static void Contactuslink()
	{
		contactusClick();
		//verifyContactTitle();
		 SoftAssert softAssert = new SoftAssert();
		    boolean actualResult = contactTxt();
		    boolean expectedResult = true;
		    softAssert.assertEquals(actualResult, expectedResult);
		    System.out.println("'Contact us  text presence verified");
		   // Assert all soft assertions
		    softAssert.assertAll();		
		   backInfypage();
		  System.out.println(" TC-2 Contact Us link test case ");
	}
//TC-03   ////Directing to career 's Link	  
	 @Test (priority=4)
	  public static void validateNewsLink() 
	    {
		clickNewsLink();
		// Verify if the user is navigated to the News page
	    SoftAssert softAssert = new SoftAssert();
	    boolean actualResult = validateNewsText();
	    boolean expectedResult = true;
	    softAssert.assertEquals(actualResult, expectedResult);
	    System.out.println("'News' text presence verified");
	   // Assert all soft assertions
	    softAssert.assertAll();
	    backInfypage();
	    System.out.println(" TC-03 News Link test case ");
    }
//TC-05 FreeWebinars link 
	    @Test(priority=5)
		public static void redirectToFreeWebinarsLink()
		{
			clickFreeWebinarsLink();
			System.out.println("Clicked on FreeWebinars link");
			SoftAssert softAssert = new SoftAssert();
		    boolean actualResult = validatewebinarText();
		    boolean expectedResult = true;
		    softAssert.assertEquals(actualResult, expectedResult);
		    System.out.println("'Webinar' text presence verified");
		   // Assert all soft assertions
		    softAssert.assertAll();
		    backInfypage();
			System.out.println(" TC-05 Webinar test case ");
			
		} 

	
// TC-04-- // Directing to  mentor ship  link
	@Test(priority=6)
	public static void redirectTOMentorshipShip()
		{
			clickMentorshipLink();
			System.out.println("Clicked on Mentorship link");
			clickLogoImage();
			System.out.println("Navigated back to Home page from Mentorshipship page");
			System.out.println(" TC-4 Mentorship link test case ");
		}
	
// TC-07 //Directing to News link 
	 	 @Test (priority=7)
	 	 public static void  validateCareersLink() {
			 
		      // Clicking on the "Careers" link in the Footer
			   clickCareersLink();
			 // Verify if the user is navigated to the 'Careers' page
			    SoftAssert softAssert = new SoftAssert();
			    boolean actualResult = validateCareerText();
			    boolean expectedResult = true;
			    softAssert.assertEquals(actualResult, expectedResult);
			    System.out.println("'Career' text presence verified");
			 // Assert all soft assertions
			    softAssert.assertAll();
			    clickHomeLink();
			    System.out.println(" TC-07 News link - test case ");
		     }
	 	
// TC-08---Directing to FAQ link
	  @Test (priority =8)
	  public static void clickFQAlink() 
	 	{
	 		FQAlink();
	 		System.out.println("Clicked on FQA link ");
	 		clickHomeLink();
	 		System.out.println("Back to Home page from FAQ link ");
	 		System.out.println(" TC-8 FAQ's link test case ");
	 		//clickHomeLink();
	 	}
	 	
 // TC-12-- Directing to Business link
	  @Test(priority=9)
	  public static void  Businesslink()
	  {
		 
		      // Clicking on the "infyni for Business " link in the Footer
			 clickinfyniForBusiness () ;
			 
			 // Verify if the user is navigated to the blogs page
			    SoftAssert softAssert = new SoftAssert();
			    boolean actualResult = infyniforbusinesText();
			    boolean expectedResult = true;
			    softAssert.assertEquals(actualResult, expectedResult);
			    		    
			 // Assert all soft assertions
			    softAssert.assertAll();
			    clickHomeLink();
			    System.out.println(" TC-12 infyni for business test case ");    
		 } 
//TC-15 -- Directing to Terms link		
		@Test (priority =10)
	 	public static void Termslinkclick() 
	 	{
			clickTermsLink();
	 		System.out.println("Clicked on Terms link ");
	 	//	backInfypage();
	 		clickHomeLink();
	 		System.out.println("Back to Home page from Terms link ");
	 		System.out.println(" TC-15 Terms Link test case ");
	 	}
//TC-14  Privacy policy link 		
				@Test(priority=11)
				public static void redirectToPrivacyPolicyLink()
				{
					clickPrivacyPolicyLink();
					System.out.println("Clicked on PrivacyPolicy link");
					SoftAssert softAssert = new SoftAssert();
				    boolean actualResult = PrivacypolicyTxtpresence();
				    boolean expectedResult = true;
				    softAssert.assertEquals(actualResult, expectedResult);
				    System.out.println("privacy policy  text presence verified");
				 // Assert all soft assertions
				    softAssert.assertAll();
				   // clickHomeLink();
				//    clickLogoImage();
				    backInfypage();
				    System.out.println(" TC-14 Terms Link test case ");	
				} 		
//TC-10-- //Become instructor test case
        @Test(priority= 12)  
        public void signup_InstrtuctorTest() 
        {
         clickonBecomeAnInstructor();          
         clickHomeLink();
         System.out.println(" TC-10 Signup as Instructor  test case ");
   	    }
 //TC-11-- //Become a Mentor test case		
	@Test(priority=13)	
	public static void redirectToBecomeAMentorPage()
	{
		clickBecomeAMentorLink();
		System.out.println("Navigated to BecomeAMentor Page");
  
		//Validating If BecomeAMentor text is displayed or not		
		boolean actualresult = becomeAMentorTextPresence();
		boolean expectedresult = true;
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualresult, expectedresult);//using soft assert
		sa.assertAll();
		System.out.println("BecomeAMentor Text Presence Validation Success");
		System.out.println(" TC-11 Signup as Mentor test case ");
	    backInfypage();
	}
	  
 //TC-09 // Become student test case
 	 @Test (priority=14)
 	 public void signup_StudentTest()
 	 {
 		clickonBecomeAnStudent();
 		System.out.println("Clicked on Student link");
        clickHomeLink();
        System.out.println(" TC-09 signup as student test case ");
 	 }



//TC - 13 -- //Verifying and Displaying  Contact Address in 
		@Test(priority = 15)
		public static void Contactaddressinfo() {
			ContactTextpresence();
			verifyContactinfo();
			boolean MailIdPresence = driver.findElement(mailidtxt).isDisplayed();
			Assert.assertTrue(MailIdPresence);
			System.out.println("contact Address Mail id presence is verified");
			boolean PhoneNumPresence = driver.findElement(phonenumber).isDisplayed();
			Assert.assertTrue(PhoneNumPresence);
			System.out.println("contact Phone Number presence is verified");
			VerifyLocations();
			System.out.println(" TC-13 Contact Address info test case ");
		}
		 
		
//TC-06-- //Directing to  'Blogs' link on Home Page footer 
		 @Test(priority= 16)
		 public static void blogsLinkVerify() 
		 {
			      	 
			    // Clicking on the "Blogs" link in the Footer
				   clickBlogsLink();
				   System.out.println("Navigated to 'Blogs' page");
			    
			    // Verify if the user is navigated to the blogs page
				   SoftAssert softAssert = new SoftAssert();
				   boolean actualResult = infyniimagePresence();
				   boolean expectedResult = true;
				   softAssert.assertEquals(actualResult, expectedResult);
				   System.out.println("Blogs page Infyni logo verified");
			    // Assert all soft assertions
				   softAssert.assertAll();		   
			    //Navigate back to Infyni Home page
				   navigateBackToHome();
				 //  clickHomeLink();
				   System.out.println("User navigated back to the Infyni homepage from the Blogs page, after closing the Blogs window");	
				   System.out.println(" TC-6 Blogs link test case ");
				 //  driver.close();
		  }
	 @AfterSuite 
	  public static void closeApplication() 
	  { 		    
			  closeApp(); 
	  }
  
}
