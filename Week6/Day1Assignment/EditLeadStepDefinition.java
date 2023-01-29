package Week6.Day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends BaseClass {

	@Given("Enter the phone number as {string}")
	public void enterCompName(String phoneNum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
	}

	@Given("Click on {string} text")
	public void enterText(String text) {
		driver.findElement(By.xpath("//*[text()='" + text + "']")).click();
	}

	@Given("Click on partyId")
	public void enterFirstName() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Given("Enter the edit lead company name as {string}")
	public void enterNewCompName(String compName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);
	}

}
