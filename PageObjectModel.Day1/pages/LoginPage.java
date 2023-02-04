package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUsername(String uName) {
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}

	public LoginPage enterPassword(String pWd) {
		driver.findElement(By.id("password")).sendKeys(pWd);
		return this;

	}

	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}

}
