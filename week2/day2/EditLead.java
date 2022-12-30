package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Test");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();

		Thread.sleep(10000);
		String text = driver.getTitle();
		System.out.println(text);

		if (text.contains("View Lead")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement element = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		element.clear();
		element.sendKeys("DMart");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();

		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text2);

		if (text2.contains("DMart")) {
			System.out.println("Updated company name is verified");
		} else {
			System.out.println("Updated company name is not verified");
		}

		driver.quit();
	}

}
