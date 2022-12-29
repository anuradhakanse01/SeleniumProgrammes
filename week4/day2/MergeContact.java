package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		driver.findElement(By.xpath("//table[@class='twoColumnForm']//td[2]/a")).click();

		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(handles);

		driver.switchTo().window(list.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("DemoCustomer")).click();

		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tr[2]/td[2]/a")).click();

		Set<String> handles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(handles1);

		driver.switchTo().window(list1.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("dp1a1contact2")).click();

		driver.switchTo().window(list1.get(0));
		driver.findElement(By.linkText("Merge")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.accept();

	}

}
