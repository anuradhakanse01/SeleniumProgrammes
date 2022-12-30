package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		Thread.sleep(10000);
		driver.findElement(By.id("firstNameField")).sendKeys("Jack");
		driver.findElement(By.id("lastNameField")).sendKeys("Sparrow");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ja");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Spa");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is description");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement ele1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sel = new Select(ele1);
		sel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.linkText("Edit")).click();

		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is IMP note");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		System.out.println(driver.getTitle());
	}

}
