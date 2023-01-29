package Week6.Day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass {

	@Given("Click on {string} link")
	public void enterlink(String link) {

		driver.findElement(By.linkText(link)).click();
	}

	@Given("Enter the company name as {string}")
	public void enterCompName(String comName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
	}

	@Given("Enter the firstName as {string}")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

	@Given("Enter the lastName as {string}")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@When("Click on submit button")
	public void clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("Lead should be displayed")
	public void verifyHomePage() {

		String expTitle = "View Lead | opentaps CRM";

		String actTitle = driver.getTitle();

		if (expTitle.equals(actTitle)) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
	}

}
