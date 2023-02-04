package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyCreateLead extends BaseClass {

	@BeforeTest
	public void setValue() {
		excelFileName = "CreateLead";

	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String uName, String pWd, String compName, String firstName, String lastName) {
		System.out.println(driver);
		new LoginPage(driver)
		.enterUsername(uName)
		.enterPassword(pWd)
		.clickLoginButton()
		.verifyHomePage()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadButton()
		.enterCompanyName(compName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickSubmitButton()
		.verifyLeadCreated();
	}

}
