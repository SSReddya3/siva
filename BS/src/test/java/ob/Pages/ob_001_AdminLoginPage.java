package ob.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//import com.ob.BaseTest.baseTest;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ob_001_AdminLoginPage {
	
	ExtentTest test;
	WebDriver driver;
	
	@FindBy(xpath = "//b[normalize-space()='Admin Login']")
	WebElement headertext;
	
	@FindBy(xpath = "//p[@class='login-box-msg']")
	WebElement bodytext;
	
	@FindBy(name = "username")
	WebElement UserName;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement SignIn;
	
	@FindBy(xpath = "//a[normalize-space()='Go to Website']")
	WebElement GoToWebsite;
	
	public ob_001_AdminLoginPage(WebDriver driver,ExtentTest test) {
		this.test = test;
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	public void login(String UN,String Pwd) {
		try {
			UserName.sendKeys(UN);
			Password.sendKeys(Pwd);
			SignIn.click();
			Assert.assertTrue(true, "User is clicked on sign in button");
			//test.log(LogStatus.PASS, "User is clicked on sign in button");
		}catch(Exception e) {
			Assert.assertTrue(false, "User is unable to click on sign in button");
			//test.log(LogStatus.FAIL, "User is unable to click on sign in button");
			e.printStackTrace();
		}
	}
	
	public void verifytitle() {
		
		
		String at;
		String et;
		
		try {
			
			 at=headertext.getText();
			 et="Online Banking System";
			Assert.assertEquals(et, at);
			//test.log(LogStatus.PASS, "Title is Matched");
		}catch(Exception e) {
			Assert.assertTrue(false, "Title is Not Matched");
			//test.log(LogStatus.FAIL, "Title  is Not Matched");
			e.printStackTrace();
		}
	
		}
		
		
	
public void verifyheadertext() {
		
		
		String at;
		String et;
		
		try {
			
			 at=driver.getTitle();
			 et="Admin Login";
			Assert.assertEquals(et, at);
			//test.log(LogStatus.PASS, "Header Text is Matched");
		}catch(Exception e) {
			Assert.assertTrue(false, "Header Text is Not Matched");
			//test.log(LogStatus.FAIL, "Header Text  is Not Matched");
			e.printStackTrace();
		}
	
		}
public void verifyBodytext() {
	
	
	String at;
	String et;
	
	try {
		
		 at=driver.getTitle();
		 et="Sign in to start your session";
		Assert.assertEquals(et, at);
		//test.log(LogStatus.PASS, " Body Text is Matched");
	}catch(Exception e) {
		Assert.assertTrue(false, "Body Text is Not Matched");
		//test.log(LogStatus.FAIL, "Body Text  is Not Matched");
		e.printStackTrace();
	}

	}


public void NavigateUserPage() {
	try {
		
		GoToWebsite.click();
		Assert.assertTrue(true, "User Page is opened");
		//test.log(LogStatus.PASS, "User Page is opened");
	}catch(Exception e) {
		Assert.assertTrue(false, "User Page is not opened");
		//test.log(LogStatus.FAIL, "User Page is not opened");
		e.printStackTrace();
	}
	
	
		
		
	
	
	
	}

}