package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static ChromeDriver driver;

	@Parameters({ "url", "password", "username" })
	@BeforeMethod
	public void preCondition(String url, String pWord, String uName) {

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("(//a[@class='slds-text-heading_small'])[4]//p[text()='Content']")).click();

	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
