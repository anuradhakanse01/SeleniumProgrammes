package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACME {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
	}

}
