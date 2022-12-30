package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01b6hhw7csjf211q4hnvqtdlyg710515.node0");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		WebElement element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select select = new Select(element);
		select.selectByIndex(1);

		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//ul[@id='j_idt87:country_items']/li[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button")).click();

		driver.findElement(By.xpath("//h5[text()='Confirm Cities belongs to Country is loaded']/following::div[3]"))
				.click();

		driver.findElement(By.xpath("//li[text()='Bengaluru']")).click();

		driver.findElement(By.xpath("//h5[text()='Choose the Course']/following::button")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']/ul/li[3]")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//h5[text()='Choose language randomly']/following::div[3]")).click();

		driver.findElement(By.xpath("//li[text()='English']")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//h5[contains(text(),'irrespective of the language chosen')]/following::div[3]"))
				.click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//ul[@id='j_idt87:value_items']/li[4]")).click();

	}

}
