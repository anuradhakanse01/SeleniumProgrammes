package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass {

	@BeforeTest
	public void setValue() {
		excelFileName = "Login";

	}

	@Test(dataProvider = "fetchData")
	public void runLogin(String uName, String pWd) {
		System.out.println(driver);
		new LoginPage(driver).enterUsername(uName).enterPassword(pWd).clickLoginButton().verifyHomePage();
	}

}
