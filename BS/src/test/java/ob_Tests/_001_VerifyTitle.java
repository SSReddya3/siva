package ob_Tests;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import ob.Pages.ob_001_AdminLoginPage;
import ob_Utilities.utilites;

@Test
public class _001_VerifyTitle {

WebDriver driver;
ExtentTest test;
	Logger log;
	String UserName;
	String Password;
	String adminURL;
	
@Test
	public void _001_VerifyTitle() throws InterruptedException, IOException {


		//try {
			//log = (Logger) LogManager.getLogger(creatingUser.class);
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			
			
				//Read properties file
				adminURL = utilites.getProperty("AdminUrl");
			
				//Navigate to Admin Login 
				//log.info("Test Execution Started");
				driver.get(adminURL);
				//https://onlinetestinghelp.com/projects/banking/admin/login.php
				
				ob_001_AdminLoginPage al = new ob_001_AdminLoginPage(driver,test);
				al.verifytitle();
				
				driver.close();
							
//				test.log(LogStatus.PASS, "Title is Matched");
				//log.info("Title is Matched");
				//Assert.assertFalse(true);
	/*	}catch(Exception e) {
			//log.info("Title is Not  Matched");
			e.printStackTrace();
		}*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
