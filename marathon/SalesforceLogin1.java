package marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.DyamicParam.ReadExcelData;

public class SalesforceLogin1 extends BaseClass {

	@Test(dataProvider = "fetchData")
	public void SalesforceLoginOne(String ques, String des) throws InterruptedException {

		WebElement element = driver.findElement(By.xpath("//a[@title='Chatter']"));
		driver.executeScript("arguments[0].click()", element);
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Chatter Home")) {
			System.out.println("Title is verified successfully");
		} else {
			System.out.println("Title is not verified");
		}
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys(ques);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(des);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();

		WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'What is')]"));
		if (ques.contains(element2.getText())) {
			System.out.println("Question is verified successfully");
		} else {
			System.out.println("Question is not verified");
		}

	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcelDataSalesforce.readData();
	}

}
