package Week6.Day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadStepDefinition extends BaseClass {


	@Given("Get FirstLeadID")
	public void getFirstLeadID() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		System.out.println(leadID);
	}

	@Given("Enter the LeadID")
	public void enterFirstLeadID() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);

	}

	@Then("Lead should be deleted")
	public void verifyDeletedLead() {

		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

}
