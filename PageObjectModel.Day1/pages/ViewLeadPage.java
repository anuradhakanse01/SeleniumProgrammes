package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {

	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage verifyLeadCreated() {
		String text = driver.findElement(By.xpath("((//div[@class='fieldgroup'])[1]//tr[1])[2]/td[2]")).getText();
		System.out.println(text);
		if (text.contains("Jack") || text.contains("Virat")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
		return this;
	}
}
