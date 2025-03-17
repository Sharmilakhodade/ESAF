package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_LoginPage;
import ESAF.Portal.Pages.ESAF_servicerequest;
import ESAF.Portal.Resorces.Utility.TextFileLogger;

public class ESAF_ServiceRequest_Testcases extends Base 
{

	ESAF_LoginPage login_page;
	ESAF_servicerequest ESAF_Service;

	@BeforeClass
	public void Initalization() throws Exception 
	{
		launchBrowser();
		System.out.println("Done");
		login_page = new ESAF_LoginPage(driver);
		ESAF_Service = new ESAF_servicerequest(driver);

	}
	  @Test(priority = 1)           // Testcase 1:- Bank user create agent requestfor all details //// 
	  public void Bankuser_create_agent_Request_All() throws InterruptedException, IOException 
	  {
	  login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName ,
	  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
	  ESAF_Service.Add_Agent(); 
	  ESAF_Service.AddRequest_All();
	  System.out.println("Request registred Successfully");
	  ESAF_Service.ServiceRequest_Verification1();
	  ESAF_Service.ServiceRequest_Verification2();
	  ESAF_Service.ServiceRequest_Report(); 
	  ESAF_Service.Logout(); }
	 
	@Test(priority = 2)              /// Testcase 2:- Bank user create agent requestfor contact details ///
	public void Bankuser_create_agent_Request_contact() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_Contact();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		System.out.println("Verification 1 Successfully");
		ESAF_Service.ServiceRequest_Verification2();
		System.out.println("Verification 2 Successfully");
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 3)                 //// Testcase 3:- Bank user create agent requestfor Account details ///
	public void Bankuser_create_agent_Request_Account() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_Account();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 4)                 //// Testcase 4:- Bank user create agent requestfor Address details ///
	public void Bankuser_create_agent_Request_Address() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_Address();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 5)               /// Testcase 5:- Bank user create agent requestfor Email details ///
	public void Bankuser_create_agent_Request_Email() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_Email();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 6)            //// Testcase 6:- Bank user create agent requestfor EducationalQualification details ///
	public void Bankuser_create_agent_Request_EducationalQualification() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_EducationalQualification();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 7) // Testcase 7:- Bank user create agent requestfor FathermotherspouseName details
	public void Bankuser_create_agent_Request_FathermotherspouseName() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_FathermotherspouseName();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 8) /// Testcase 8:- Bank user create agent requestfor Name details ///
	public void Bankuser_create_agent_Request_Name() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_Name();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 9) //// Testcase 9:- Bank user create agent requestfor Deactivate details ///
	public void Bankuser_create_agent_Request_Deactivate() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_Deactivate();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 10) //// Testcase 10:- Bank user create agent requestfor Reset details ///
	public void Bankuser_create_agent_Request_Reset() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_Reset();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 11) /// Testcase 11:- Bank user create agent requestfor RevokePan details ///
	public void Bankuser_create_agent_Request_RevokePan() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_RevokePan();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 12) //// Testcase 12:- Bank user create agent requestfor Terminate details ///
	public void Bankuser_create_agent_Request_Terminate() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		ESAF_Service.AddRequest_Terminate();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		ESAF_Service.Logout();
	}

	@Test(priority = 12) //// Testcase 12 :- Aggregator create agent Activate request ///////////////
	public void Aggregator_Login_Agent_Activate_Request() throws InterruptedException, IOException 
	{

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		ESAF_Service.Aggregator_AgentServiceRequest_active();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}

	@Test(priority = 14) //// Testcase 14 :- Aggregator create agent DeActivate request ///////////////
	public void Aggregator_Login_Agent_Deactivate_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		ESAF_Service.Aggregator_AgentServiceRequest_Deactive();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}

	@Test(priority = 15) //// Testcase 15 :- Aggregator create agent Terminate request ///////////////
	public void Aggregator_Login_Agent_Terminate_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		ESAF_Service.Aggregator_AgentServiceRequest_Terminate();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}

	@Test(priority = 16) //// Testcase 16 :- Aggregator create agent RevokePan request ///////////////
	public void Aggregator_Login_Agent_RevokePan_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		ESAF_Service.Aggregator_AgentServiceRequest_RevokePan();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}

	@Test(priority = 17) //// Testcase 17 :- Aggregator create Aggregator Active request ///////////////
	public void Aggregator_Login_Aggregator_Active_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		ESAF_Service.Aggregator_AggregatorServiceRequest_active();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}

	@Test(priority = 18) //// Testcase 18 :- Aggregator create Aggregator Deactive request
							//// ///////////////
	public void Aggregator_Login_Aggregator_Deactive_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		ESAF_Service.Aggregator_AggregatorServiceRequest_Deactive();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}

	@Test(priority = 19) //// Testcase 19 :- Aggregator create Aggregator Terminate request//// /////
	public void Aggregator_Login_Aggregator_Terminate_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		ESAF_Service.Aggregator_AggregatorServiceRequest_Terminate();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}

	@Test(priority = 20) //// Testcase 20 :- Aggregator create Aggregator Reset request ///////
	public void Aggregator_Login_Aggregator_Reset_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		ESAF_Service.Aggregator_AggregatorServiceRequest_Reset();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}

	@Test(priority = 21) //// Testcase 21 :- Aggregator create Aggregator All request ///////////////
	public void Aggregator_Login_Aggregator_All_Request() throws InterruptedException, IOException {
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		ESAF_Service.Aggregator_AddRequest_All();
		System.out.println("Request registred Successfully");
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();

		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) // UserName
				, getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}

	/*
	 * @AfterClass public void tearDown() throws IOException { if (driver != null) {
	 * driver.quit(); System.out.println("WebDriver Closed"); // Browser Closed
	 * TextFileLogger.closeLogger(); } }
	 */

}
