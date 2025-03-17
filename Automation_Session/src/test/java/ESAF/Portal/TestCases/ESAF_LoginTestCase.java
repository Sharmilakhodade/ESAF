package ESAF.Portal.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import ESAF.Portal.Pages.ESAF_LoginPage;
import ESAF.Portal.Pages.ESAF_servicerequest;

@Test
public class ESAF_LoginTestCase extends Base 
{
	ESAF_LoginPage login_page;
	ESAF_servicerequest ESAF_Service;
	
	@BeforeClass
	public void Initalization() throws Exception 
	{
		launchBrowser();
		System.out.println("Done");
		login_page = new ESAF_LoginPage(driver);

		
	}
	
	@Test(priority = 1) 
	public void  ESAF_Login() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		
		System.out.println("Login Successfully");
		
	}
	
	
	
	

	@AfterClass
	@Test(priority = 2,dependsOnMethods = "ESAF_Login")
	public void Close() throws IOException 
	{
		 if (driver != null) 
		 {
	            driver.quit();
	            System.out.println("WebDriver Closed");
	           // TextFileLogger.closeLogger();
	        }
	}
	
	
}
