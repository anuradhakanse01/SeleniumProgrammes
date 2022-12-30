package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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

		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[contains(@class,'firstName')])[2]"));

		System.out.println(ele.getText());

		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();

		Thread.sleep(10000);
		String text = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		if (text.equals("Duplicate Lead")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}

		driver.findElement(By.linkText("Create Lead")).click();
		driver.quit();

	}

}
