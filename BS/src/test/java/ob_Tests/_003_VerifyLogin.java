package ob_Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import ob.Pages.ob_001_AdminLoginPage;
import ob_Utilities.utilites;

public class _003_VerifyLogin {

	WebDriver driver;
	ExtentTest test;
		Logger log;
		String UserName;
		String Password;
		String adminURL;
		
	@Test
		public void _003_VerifyLogin() throws InterruptedException, IOException {



		WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				
				
					//Read properties file
					adminURL = utilites.getProperty("AdminUrl");
					UserName = utilites.getProperty("AdminUserName");
					Password = utilites.getProperty("AdminPassword");
					
					//Navigate to Admin Login 
					
					driver.get(adminURL);

					ob_001_AdminLoginPage al = new ob_001_AdminLoginPage(driver,test);
					al.login(UserName, Password);
					


					
					driver.close();
								
//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
