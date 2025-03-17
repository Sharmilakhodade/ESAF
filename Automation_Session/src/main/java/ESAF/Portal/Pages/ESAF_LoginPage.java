package ESAF.Portal.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ESAF.Portal.Resorces.Utility;

public class ESAF_LoginPage extends Utility 
{

	WebDriver driver;

	@FindBy(xpath = "//input[@id='txtUserName']")
	WebElement txtusername;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement txtPWd;

	// Alert Happned with OTP text OTP has been sent.

	@FindBy(xpath = "//input[@id='txtLoginValidation']")
	WebElement txtOTP;

	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement btnsubmit;

	@FindBy(id = "btnLoginValidation")
	WebElement btnvalidate_After_OTP;

	@FindBy(xpath = "//div[@id='sidebar-nav']")
	WebElement LeftMenu;

	@FindBy(xpath = "//span[@id='RequiredFieldValidator5']")
	WebElement lblblankUsername; // Please enter UserName

	@FindBy(xpath = "//span[@id='RequiredFieldValidator5']")
	WebElement lblblankPwd; // Login failed

	@FindBy(xpath = "//label[@id='lblErrorMsg']")
	WebElement Error_BLank_Pwd;

	public ESAF_LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String className = this.getClass().getSimpleName();

	public void Check_Valid_Credentials(String UserName, String Password) throws InterruptedException, IOException
	{
		driver.navigate().refresh();
		Thread.sleep(2000);
		//TextFileLogger.logMessage("Check_Valid_Credentials TestCase Start");
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
		}
		
		Thread.sleep(2000);
		
		txtusername.clear();
		txtusername.sendKeys(UserName);
		txtPWd.clear();
		txtPWd.sendKeys(Password);
		btnsubmit.click();
		Thread.sleep(1000);
		if (isAlertPresent() == true) {
			if (driver.switchTo().alert().getText().contains("OTP has been sent.")) {
				driver.switchTo().alert().accept();
				txtOTP.sendKeys("123456");
				btnvalidate_After_OTP.click();
			}

			else if (driver.switchTo().alert().getText()
					.contains("User Already Active. Please Try After 10 Minutes!")) {
				driver.switchTo().alert().accept();

				if ((isAlertPresent() == true)
						&& driver.switchTo().alert().getText().contains("You Want To Logout From Other Device?")) {
					driver.switchTo().alert().accept();

					if (driver.switchTo().alert().getText().contains("OTP has been sent.")) {
						driver.switchTo().alert().accept();
						txtOTP.sendKeys("123456");
						btnvalidate_After_OTP.click();
					}

					// driver.switchTo().alert().accept();
				}

			}
	}
}
}


