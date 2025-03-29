package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass4;
import com.NewAutomationProject.BaseClass.BaseClass5;
import com.NewAutomationProject.pageObjects.OrangeHrmAdminDashboard_Page;
import com.NewAutomationProject.pageObjects.OrangeHrmLiveDemo_Page;

public class TC_002_OrangeHrmAdminDashboard_Page_Test extends BaseClass4{
	public OrangeHrmLiveDemo_Page l;
	public OrangeHrmAdminDashboard_Page d;
	
	
	
	@Test(dataProvider = "loginData")
	public void adminDashboardPageValidation(String username, String password)
	{
		
	
	l=new OrangeHrmLiveDemo_Page(driver);
	d=new OrangeHrmAdminDashboard_Page(driver);
	
//    l.userField("Admin");
//	log.info("successfully Entered username in the login");
//	
//	l.passField("admin123");
//   log.info("successfully Entered the password in the field");
	
	l.enterCredentials(username, password);
	 
	l.LoginBtn();
	log.info("successfully clicked on the login button");
	
	d.AdminBtnClick();
	log.info("successfully clicked on the admin button of the dashboard page");
	
	d.userDashField("sachshel");
	log.info("successfully entered the username in the Dashboard page");
	
	d.userRoleFiledClick();
	log.info("successfully clicked on the user role field option");
	
	d.userOptionSelectEss();
	log.info("successfully selected the ESS option from the user option of the Dashboard");
	
	//d.EmployeeNameEnter("sachin");
	//log.info("successfully Entered the employee name in the Dashboard page");
	
	d.statusOptinClick();
	log.info("successfully clicked on the status option of the Dashboard page");
	
//	d.selectDisabledOption();  
//	log.info("successfully selected the disabled option in the Dashboard page");
	

}
}
