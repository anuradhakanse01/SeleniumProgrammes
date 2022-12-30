package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9994909976");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(10000);
		WebElement findElement = driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[2]"));
		String text = findElement.getText();
		System.out.println(text);

		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();

		Thread.sleep(5000);
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item'][1]/div[1]/input")).sendKeys(text);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();

		if (text2.equals("No records to display")) {
			System.out.println("Successful deletion");
		} else {
			System.out.println("No successful deletion");
		}

		driver.quit();

	}

}
