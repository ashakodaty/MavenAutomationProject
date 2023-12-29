package infyniTestAutomation.pageobjects;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import infyniTestAutomation.base.Base;

public class InfyniHomePage extends Base {
//Web Elements for the quick links in Infyni homepage footer
//Common Login Button Home page Objects	
	public static By loginButton = By.xpath("(//li/a[@href='/login/'])[1]");
	public static By loginText=By.xpath("//p[contains(text(),'Login to your account')]");
//Home Page AboutUsLink Objects	
	public static By aboutUsLink=By.xpath("//a[@href='/about-us']"); //action click
	public static By aboutUsText=By.xpath("//h1[@class='text-white']");//to verify text presence
//Home Page BecomeAMentor Objects	
	public static By becomeAMentor=By.xpath("//a[text()='Become a Mentor']");//action click
	public static By becomeAMentorText=By.xpath("//h1[@class='text-white' and text()='Become a Mentor']");//to verify text presence
//Home Page Blogs link element locators
	public static By blogsLink = By.xpath("//a[@href='https://infyni.com/blog/']");
	public static By infyniimage = By.xpath("//img[@id='logo']");
    public static By fblocator = By.xpath("//a[@target='_blank']");
	public static By bloglogoimage = By.xpath("//img[@src='https://infyni.com/blog/wp-content/themes/infyniblog/assets/img/header-shape.png']");
//Home page - Become an Instructor link Web Elements 
	public static By instructorLink = By.xpath("//li/a[@href='/instructor-register/']");
	public static By getstartedButton = By.xpath("//a[@class='butn style-one red  ml-1 mb-1'][1]");    
//Common Redirect links to home page from all pages 	
	public static By homeLink = By.xpath("//a[contains(text(),'Home')]"); // action click
	public static By logoImage = By.xpath("//img[@id='logo']");
	public static By homelink = By.xpath("//a[@href='/' and text()='Home']");
	public static By backhomelink = By.xpath("//div[@class='page-title-section mb-3 p-0 ']");
//Home page related contact us link objects
	public static By contactusLink = By.xpath("//a[@href='/contact/']");
	public static By contactusText = By.xpath("//h1[@class='text-white']");
	public static By contacttext = By.xpath("//div[@class='col-sm-12 col-lg-4 col-xl-4 mb-4 mb-sm-5 mb-lg-0']");
	public static By mailidtxt =By.xpath("//a[@href='mailto:contact@infyni.com']");
	public static By phonenumber  =By.xpath("//i[@class='fas fa-mobile-alt mt-1 mr-3']");
	public static By Totallocators = By.xpath("//i[@class='fas fa-map-marker-alt mt-1 mr-3']");
//Home page related to student sign up
	public static By studentsignup = By.xpath("//a[@class='butn style-one  text-nowrap red mt-2 btn-danger']");
	public static By SigninButton = By.xpath("//button[@type='submit' and @id='jsEmailRegBtn']");
//Home Page related to FAQ's
	public static By FAQlink = By.xpath("//a[@href='/operation/help_category/']");
//Home page related to terms link
	public static By Termslink = By.xpath("//a[@href='/terms']");
//Home page related Business link	
	public static By infyniForBusinessLink = By.xpath("(//a[@href='/business/'])[2]"); //Action = click
	public static By homelink1 = By.xpath("//a[@href='/']");
	public static By infyniforbusinesText = By.xpath("//div/h1[@class='text-white' and text () ='infyni for Business']");
//Home page related mentor ship link	
	public static By MentorshipLink=By.xpath("//a[contains(text(),'Mentorship')]");	
//Home page footer - 'Careers' link objects
	public static By careersLink = By.xpath("//li/a[@href='/users/career/']"); // action click
	public static By careerText = By.xpath("//div/h1[@class='text-white']"); 
	public static By careertxt =By.xpath("//div/ul/li/a[@href='javascript:void(0)']");
// Home Page footer - 'News' link objects
	public static By newsLink	= By.xpath("//li/a[@href='/users/announcement/' and text() = 'News']");
	public static By newsText = By.xpath("//div/h1[@class='text-white' and text() = 'News']");
	public static By Newstxt= By.xpath("//div/ul/li/a[@href='javascript:void(0)']");
//Home page footer - FreeWebinars link objects 
	public static By freeWebinarsLink=By.xpath("//a[contains(text(),'Free Webinars')]");
	public static By freewebinartxt= By.xpath("//div/ul/li/a[@href='javascript:void(0)']");
//Home page footer - "Privacy Policy " link objects
	public static By privacyPolicyLink=By.xpath("//a[contains(text(),'Privacy Policy')]");
	public static By privacypolicytxt= By.xpath("//div/ul/li/a[@href='javascript:void(0)']");
	
	/*
	 * //Home page blogs continuing to instructor page public static By
	 * becomeinstructor =
	 * By.xpath("//a[@href='https://infyni.com/instructor-register/']");
	 */
//Method to click on the "Log In" button on infyni homepage
	
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
	  
//Method -3
//Method to scroll down to the specific link or element
  	    public static void scrollDownToElement(WebElement element)
  	    {
		Actions actions = new Actions(driver); 
	    actions.moveToElement(element); 
	    actions.perform(); 
	    } 
  	    
//Method 4			
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
		
//Method -5
		public static void clickLogoImage()
		{
		try 
		{
		driver.findElement(logoImage).click();
		} 
		catch (Exception e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}

//Method -6
//Common method to navigate from child window to infyni home page
		
		public static void navigateBackToHome() 
		{
	    String mainWindow = driver.getWindowHandle();
	    Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr = windows.iterator();
	    while (itr.hasNext())
	    {
	    String childWindow = itr.next();
        if (!childWindow.equals(mainWindow))
	    {
	    try 
	    {
		driver.switchTo().window(childWindow);
		}
	    catch (Exception e) {
		e.printStackTrace();
		}
        // Get the title of the child window's page
	    String windowTitle = driver.getTitle();
        if (windowTitle.contains("Expected Title"))
	    {
	    driver.close();
	    driver.switchTo().window(mainWindow);
	    return;
	    }
	    }
	    }     
		}
		
// About Us link getting clicked 
	    public static void clickAboutUsLink()
		{
			try 
			{
			driver.findElement(aboutUsLink).click();
			} 
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
//verification for AboutUs text presence
		public static boolean aboutUsTextPresence()
		{
			boolean result=false;
			
			try {
				result=driver.findElement(aboutUsText).isDisplayed();
			} 
				catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
			
		}
//Become a Mentorship getting clicked  
		public static void clickMentorshipLink()
		{
			try 
			{
			driver.findElement(MentorshipLink).click();
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
//validating the aboutUs text 
		public static String aboutUsText()
		{
			String value=" ";
			try {
				value=driver.findElement(aboutUsText).getText();
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return value;
		}
//become a mentor link getting clicked 
	    public static void clickBecomeAMentorLink()
		{
			try
			{
			driver.findElement(becomeAMentor).click();
			} 
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
  
//verification for BecomeAMentor text presence
		public static boolean becomeAMentorTextPresence()
			{
			boolean result=false;
			try
			{
			result=driver.findElement(becomeAMentorText).isDisplayed();
			} 
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			return result;
			}
//Free webinars getting clicked 		
		public static void clickFreeWebinarsLink()
		{
			try {
				driver.findElement(freeWebinarsLink).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//webinar text presence text verification
		public static boolean validatewebinarText()
		 {
			  boolean result = false;
			  try 
			  {
			  result = driver.findElement(freewebinartxt).isDisplayed(); 
			  System.out.println(" 'Webinar' Text dispaly is verified on infyni careers page");
			  } 
			  catch (Exception e)
			  {			  
			  e.printStackTrace(); 
			  } 
			  return result; 
		}
//privacy policy verification 
		public static boolean PrivacypolicyTxtpresence()
		{
			boolean result=false;
			
			try {
				result=driver.findElement(privacypolicytxt).isDisplayed();
			} 
				catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;					
		}
//Privacy policy getting clicked 		
		public static void clickPrivacyPolicyLink()
		{
			try {
				driver.findElement(privacyPolicyLink).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
// contact verication 
		public static boolean contactTextpresence()
		{
			boolean result=false;
			
			try {
				result=driver.findElement(contacttext).isDisplayed();
			} 
				catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;					
		}
//Infyni for business link 
		 public static void clickinfyniForBusiness () { 
			//Click on the "become an instructor" link in the footer
				 try {
				 driver.findElement(infyniForBusinessLink).click();
				 System.out.println("User clicked on the 'infyni for Business' link on the infyni homepage footer");
				 } 
				 catch (Exception e)
				 {
	    		 e.printStackTrace();
				 } 
				  }
	
//Method to click on the "Blogs" link in the footer
			public static void clickBlogsLink() 
			{
				try {
				driver.findElement(blogsLink).click();
				} 
				catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			    System.out.println("'Blogs' link under Quick links on infyni home page footer is clicked");
			  }
			
//verifying infyni for business text 
			public static boolean infyniforbusinesText()
			{
				  boolean result = false;
				  try 
				  {
				  result = driver.findElement(infyniforbusinesText).isDisplayed(); 
				  System.out.println("infyni for Business Text dispaly is verified");
				  } 
				  catch (Exception e)
				  { 
				  // TODO Auto-generated catch block
				  e.printStackTrace();
				  } 
				  return result; 
		     }
         

//Validation method for Infyni - Blogs page
			   public static boolean infyniimagePresence() 
			   {			             
				   boolean result = false;
				   try
				   {
				   result = driver.findElement(infyniimage).isDisplayed();
				   } 	
				   catch (Exception e)
				   {
				   e.printStackTrace();
				   }
				   return result;
				  }
			   
 
//Method to go back to home page 
			   public static void backToHomePage() 
			   { 
				 driver.findElement(homelink).click(); 
			   }
 
//Click on 'Become an Instructor' link at the infyni home page footer 
				public static void clickonBecomeAnInstructor() { 
			    //Click on the "become an instructor" link in the footer
					   try 
					   {
						driver.findElement(instructorLink).click();
						System.out.println("User clicked on the 'become an instructor' link on the infyni homepage footer");
					   } 
					   	catch (Exception e) {
					
						e.printStackTrace();
					   	} 
				}
//become a instructor getting clicked 
				public static void clickGetStartedButton()
				      {					
					  try {
						driver.findElement(getstartedButton).click();
						System.out.println("User clicked on 'Get Started' button on 'Become an Instructor' web page");
						} 
						catch (Exception e)
						{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
// infyni home page footer - careers link

				 public static void clickCareersLink() 
				 { 					
					  try 
					  {
					  driver.findElement(careersLink).click();
					  System.out.println("'Careers' link is clicked on infyni home page footer");
					  } 
					  catch (Exception e) 
					  {
					  e.printStackTrace();
					  } 
					  }		
// infyni home page footer - Validate career text
				 public static boolean validateCareerText()
				 {
					  boolean result = false;
					  try 
					  {
					  result = driver.findElement(careertxt).isDisplayed(); 
					  System.out.println(" 'Career' Text dispaly is verified on infyni careers page");
					  } 
					  catch (Exception e)
					  {			  
					  e.printStackTrace(); 
					  } 
					  return result; 
					    	}
// News link methods
				  public static void clickNewsLink() 
				  { 					   
					   try 
					   {
						driver.findElement(newsLink).click();
						System.out.println("'News' link is clicked on infyni home page footer");
					    } 
					   catch (Exception e) 
					   {					
						e.printStackTrace();
					   } 
				   }				 
				
//Validate News link verification 
				  public static boolean validateNewsText()
				  {
					   boolean result = false;
					   try 
					   {
					  // result = driver.findElement(newsText).isDisplayed();
					   result = driver.findElement(Newstxt).isDisplayed();
					   System.out.println(" 'News' Text dispaly is verified on infyni News page");
					   } 
					   catch (Exception e)
					   {					   	
					   e.printStackTrace();
					   } 
					   return result; 
					   }
//FAQ link click 
				public static void FQAlink(){
					  	{
						try {
						driver.findElement(FAQlink).click();
						} 
						catch (Exception e)
						{
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
						}System.out.println("FQA link got clicked ");
				        }
//Terms link click				
				public static void clickTermsLink() {
					try 
					{
					driver.findElement(Termslink).click();
					} 
					catch (Exception e)
					{
					// TODO Auto-generated catch block
					e.printStackTrace();
					}System.out.println("Terms link got clicked ");
				}


 
// verifying contact us text is displayed
				public static boolean contactTxt() {
					boolean result = false;
					try {
						result = driver.findElement(contactusText).isDisplayed();
					} catch (Exception e) {
						e.printStackTrace();
					}
					return result;
				
				}
 
// contact us link action performed
				public static void contactusClick() {
					try {
						driver.findElement(contactusLink).click();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("contactus link got clicked");
				}
//Contact information  verification 				
//Verifying contact text is displayed
				public static boolean ContactTextpresence()
				{
					boolean result=false;
					
					try {
						result=driver.findElement(contacttext).isDisplayed();
					} 
						catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return result;					
				}
//verifying contact info 				
				public static void verifyContactinfo() 
				{
					boolean ContactText = ContactTextpresence();
					boolean expectedContactText = true ;
					Assert.assertEquals(ContactText, expectedContactText);
					System.out.println("ActualText:" +ContactText);
					System.out.println("Contact info verified");					
					System.out.println("Contact text is retrieved");
				}
				
				public static void VerifyLocations() {
					
						List<WebElement> Total_locators = driver.findElements(Totallocators);
						int count3 = Total_locators.size();
						System.out.println("Total locators are " + count3);
						boolean locatorspresence = driver.findElement(Totallocators).isDisplayed();
						Assert.assertTrue(locatorspresence);
						System.out.println("3 locations are present is  verified");
					}
				
//Signup as student method
				
				public static void StudentSignup() {
					try {
						driver.findElement(studentsignup).click();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("SIGNUP as a student");
				}

// back to Home page
				public static void backInfypage() {
					try {
						driver.findElement(backhomelink).click();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("back 2 home page link got clicked");

				}

//Infyni title verification
				public static void verifyInfyniTitle() 
				{
					String InfyniTitle = driver.getTitle();
					System.out.println("Title is" + InfyniTitle);
					String expectedInfyTitle = "Index Title 1 | Index Title 2 | Index Title 3 infyni";
					Assert.assertEquals(InfyniTitle, expectedInfyTitle);
					System.out.println("infyni page title verified");
				}
// verifying the logo
				public static void verifyLogo() 
				{
					boolean logopresence = driver.findElement(logoImage).isDisplayed();
					Assert.assertTrue(logopresence);
					System.out.println("Infyni logo verified");
				}
 //Click on 'Become an Student' link at the infyni home page footer 
				public static void clickonBecomeAnStudent() { 
				   //Click on the "become an instructor" link in the footer
				   try {
				   driver.findElement(studentsignup).click();
				   System.out.println("User clicked on the 'become an Student' link on the infyni homepage footer");
				   } 
				   catch (Exception e)
				   {
					e.printStackTrace();
				   } 
				   System.out.println("SIGNUP as a student");
				   }
  
			
}

		

