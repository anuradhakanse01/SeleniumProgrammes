package marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.DyamicParam.ReadExcelData;

public class SalesforceLogin2 extends BaseClass {

	@Test(dataProvider = "fetchData")
	public void SalesforceLoginTwo(String opport, String amount) throws InterruptedException {

		driver.findElement(By.linkText("View All Key Deals")).click();
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(opport);
		driver.findElement(
				By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]"))
				.click();
		driver.findElement(By.xpath("//span[text()='New Customer']")).click();
		driver.findElement(
				By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]"))
				.click();
		driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("2/20/2023");
		driver.findElement(
				By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]")).click();
		driver.findElement(By.xpath("//span[@title='test']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcelDataSalesforce.readData1();
	}

}
