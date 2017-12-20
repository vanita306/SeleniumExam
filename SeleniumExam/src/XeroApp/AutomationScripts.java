package XeroApp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AutomationScripts extends ReUsableMethods{
	
	//Test Case 1(A)

	public static void Navigate_to_XERO_ID01_A () throws IOException, InterruptedException {
			
		String	userName=  recData[i+1][8];
		String	passwd= recData[i+1][11];

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.xero.com/us/");
		
		/*Click Login Tab*/
		WebElement loginTab= driver.findElement(By.xpath("//*[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		clickObj(loginTab, "Login");
		
		/*Enter email address*/
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		enterText(email, userName, "UserName");
			
		/*Enter Password*/
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		enterText(password, passwd, "Password");
				
			/*Click login Button*/
			WebElement loginButton = driver.findElement(By.xpath("//*[@id='submitButton']"));
			clickObj(loginButton, "Login");
			Thread.sleep(4000);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			bw.close();
					
		}
		
		//Test Case 1(B)

		public static void Incorrect_Password_ID01_B() throws IOException, InterruptedException{
			String	userName=  recData[i+1][8];
			String	passwd= recData[i+1][11];

			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.xero.com/us/");
			
			/*Click Login Tab*/
			WebElement loginTab= driver.findElement(By.xpath("//*[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
			clickObj(loginTab, "Login");
			
			/*Enter email address*/
			WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
			enterText(email, userName, "UserName");
				
			/*Enter Password*/
			WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
			enterText(password, passwd, "Password");
			
			
			/*Click login Button*/
			WebElement loginButton = driver.findElement(By.xpath("//*[@id='submitButton']"));
			clickObj(loginButton, "Login");
			Thread.sleep(4000);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			bw.close();
		}
		

	//Test Case 1(C)
		
		public static void Incorrect_Email_ID01_C() throws IOException, InterruptedException{
			String	userName=  recData[i+1][8];
			String	passwd= recData[i+1][11];
			
			driver.get("https://www.xero.com/us/");
			
			/*Click Login Tab*/
			WebElement loginTab= driver.findElement(By.xpath("//*[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
			clickObj(loginTab, "Login");
			
			/*Enter email address*/
			WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
			enterText(email, userName, "UserName");
				
			/*Enter Password*/
			WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
			enterText(password, passwd, "Password");
			
			
			/*Click login Button*/
			WebElement loginButton = driver.findElement(By.xpath("//*[@id='submitButton']"));
			clickObj(loginButton, "Login");
			Thread.sleep(4000);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			bw.close();
		}


	//Test Case 1(D)	

		
		public static void Forgot_Password_ID01_D() throws IOException, InterruptedException{
	        driver.get("https://www.xero.com/us/");
			
			/*Click Login Tab*/
			WebElement loginTab= driver.findElement(By.xpath("//*[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
			clickObj(loginTab, "Login");
						
			
			/*Click "Forgot your Password"link*/
			WebElement ForgotPassLink = driver.findElement(By.xpath("//*[@class='forgot-password-advert']"));
			clickObj(ForgotPassLink, "Forgot Password Link");
			
			String	userName=  recData[i+1][8];
		
			/*Enter email address*/
			WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
			enterText(email, userName, "UserName");

			
			/*Click Send Link Button*/
			WebElement sendLinkButton = driver.findElement(By.xpath(".//*[@id='submitButton']/a/span"));
			clickObj(sendLinkButton, "Send Link Button");
			
			Thread.sleep(4000);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			bw.close();
		}

	//Test Case 2(A)	

			public static void Sign_Up_Free_Trial_XDC_ID02_A() throws IOException, InterruptedException{
			
		
	        driver.get("https://www.xero.com/us/");
			
			/*Click Free Trial Tab*/
			WebElement freeTrialTab= driver.findElement(By.xpath("//*[@class='btn btn-primary global-ceiling-bar-btn']"));
			clickObj(freeTrialTab, "Free Trial Tab");
					
			String	firstname= recData[i+1][6];
			String	lastname= recData[i+1][7];
			String	email= recData[i+1][8];
			String	phNum= recData[i+1][9];
			String	country_name= recData[i+1][10];
		

			/*Enter First Name */
			WebElement fName = driver.findElement(By.xpath(".//*[@name='FirstName']"));
			enterText(fName, firstname, "FirstName");
			
			/*Enter Last Name */
			WebElement lName = driver.findElement(By.xpath(".//*[@name='LastName']"));
			enterText(lName, lastname, "LastName");
			
			/*Enter email address*/
			WebElement emailAdd = driver.findElement(By.xpath("//*[@name='EmailAddress']"));
			enterText(emailAdd, email, "Email");
			
			/*Enter Phone Number*/
			WebElement phoneNum = driver.findElement(By.xpath("//*[@name='PhoneNumber']"));
			enterText(phoneNum, phNum, "Phone Number");
			
			
			/*Select Country*/
			
			WebElement selectmenu= driver.findElement(By.xpath("//*[@name='LocationCode']"));
			selectmenu.click();
			
			
			Select select=new Select(selectmenu);
			select.selectByVisibleText(country_name);
			Thread.sleep(4000);
			
					
			/*Click Terms and Policy Check box*/
			WebElement termsAndPolicyChkBox= driver.findElement(By.xpath("//*[@name='TermsAccepted']"));
			clickObj(termsAndPolicyChkBox, "Terms and Policy Checkbox");
			
			/*Click Get Started Button*/
			WebElement getStarted= driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
			clickObj(getStarted, "Get Started");
					
			bw.close();
		}

			//Test Case 2(B)	
			
			public static void Sign_Up_No_Fill_Field_XDC_ID02_B() throws IOException, InterruptedException{
				
				System.out.println("Invalid Test Case");
				bw.close();
					
			
			}
			
			
	//Test Case 2(C)	


		public static void Sign_Up_Use_and_Privacy_Link_XDC_ID02_C() throws IOException, InterruptedException{
			
		
	        driver.get("https://www.xero.com/us/");
			
			/*Click Free Trial Tab*/
			WebElement freeTrialTab= driver.findElement(By.xpath("//*[@class='btn btn-primary global-ceiling-bar-btn']"));
			clickObj(freeTrialTab, "Free Trial Tab");
					
			

			/*Click Terms Link*/
			WebElement termsLink= driver.findElement(By.xpath("//*[@href='https://www.xero.com/us/about/terms/']"));
			clickObj(termsLink, "Terms of use");
			Thread.sleep(4000);
			
			
			String parent = driver.getWindowHandle();
			   for (String child : driver.getWindowHandles()) {
			    
			     if(!child.equals(parent)){
			     driver.switchTo().window(child);
			     String expected = "Xero Terms of Use | Xero";
			     String actual = driver.getTitle();
			     if(expected.equals(actual)){
			      System.out.println("In Terms of Use Window");
			      driver.close();
			     }}}
			   driver.switchTo().window(parent);
			Thread.sleep(8000);
			
			
			/*Click Policy Link*/
			WebElement policyLink= driver.findElement(By.linkText("privacy policy"));
			clickObj(policyLink, "Policy Link");
			Thread.sleep(4000);
					
		}


	//Test Case 2(D)
			
		public static void Sign_Up_Offer_Details_XDC_ID02_D() throws IOException, InterruptedException{
			
		
	        driver.get("https://www.xero.com/us/");
			
			/*Click Free Trial Tab*/
			WebElement freeTrialTab= driver.findElement(By.xpath("//*[@class='btn btn-primary global-ceiling-bar-btn']"));
			clickObj(freeTrialTab, "Free Trial Tab");

			
			/*Click Offer Details link*/
			WebElement offerDetails= driver.findElement(By.linkText("offer details"));
			clickObj(offerDetails, "Offer Details Link");
			
			Thread.sleep(4000);
			
		}
		

	//Test Case 2(E)
			
		public static void Sign_Up_Accountant_and_Bookkeeper_XDC_ID02_E() throws IOException, InterruptedException{
			
		
	        driver.get("https://www.xero.com/us/");
			
			/*Click Free Trial Tab*/
			WebElement freeTrialTab= driver.findElement(By.xpath("//*[@class='btn btn-primary global-ceiling-bar-btn']"));
			clickObj(freeTrialTab, "Free Trial Tab");


			/*Click Accountant and BookKeeper Link*/
			WebElement accBook= driver.findElement(By.linkText("accountant or bookkeeper"));
			clickObj(accBook, "Accountant and Book Keeper Link");
			
			Thread.sleep(4000);
				
		
		}
		
	
//Test Case 3(A)
		
	public static void Test_all_tabs_page_ID03_A() throws IOException, InterruptedException{
		
		String	userName=  recData[i+1][8];
		String	passwd= recData[i+1][11];

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.xero.com/us/");
		
		/*Click Login Tab*/
		WebElement loginTab= driver.findElement(By.xpath("//*[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		clickObj(loginTab, "Login");
		
		/*Enter email address*/
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		enterText(email, userName, "UserName");
			
		/*Enter Password*/
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		enterText(password, passwd, "Password");
			
		/*Click login Button*/
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='submitButton']"));
		clickObj(loginButton, "Login");
		Thread.sleep(4000);
		
		/*Click on Dashboard*/
		WebElement dashBoard= driver.findElement(By.linkText("Dashboard"));
		clickObj(dashBoard, "DashBoard Tab");
		Thread.sleep(4000);
		
		/*Click on Accounts*/
		WebElement account= driver.findElement(By.xpath(".//*[@id='Accounts']"));
		clickObj(account, "Accounts Tab");
		Thread.sleep(4000);
		
		/*Click on Reports*/
		WebElement reports= driver.findElement(By.xpath(".//*[@id='Reports']"));
		clickObj(reports, "Reports Tab");
		Thread.sleep(4000);
		
		/*Click on Contacts*/
		WebElement contacts= driver.findElement(By.xpath(".//*[@id='Contacts']"));
		clickObj(contacts, "Contacts Tab");
		Thread.sleep(4000);
		
		/*Click on Settings*/
		WebElement settings= driver.findElement(By.xpath(".//*[@id='Settings']"));
		clickObj(settings, "Settings Tab");
		Thread.sleep(4000);
		

		/*Click on plus sign*/
		WebElement plusSign= driver.findElement(By.xpath(".//*[@id='quicklaunchTab']"));
		clickObj(plusSign, "New Tab");
		Thread.sleep(4000);
		
		
		/*Click on Files*/
		WebElement files= driver.findElement(By.xpath(".//*[@class='files']"));
		clickObj(files, "Files Tab");
		Thread.sleep(4000);
		
		/*Click on Notifications*/
		WebElement notif= driver.findElement(By.xpath(".//*[@class='notifications']"));
		clickObj(notif, "Notifications Tab");
		Thread.sleep(4000);
		
		/*Click on Search*/
		WebElement search= driver.findElement(By.xpath(".//*[@class='search']"));
		clickObj(search , "Search Tab");
		Thread.sleep(4000);
		
		/*Click on Help*/
		WebElement help= driver.findElement(By.xpath(".//*[@class='help']"));
		clickObj(help , "Help Tab");
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		bw.close();
		

		
	
	}
	

}
