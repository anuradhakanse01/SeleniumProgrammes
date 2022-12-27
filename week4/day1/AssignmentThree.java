package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentThree {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		driver.get("https://buythevalue.in/");

		driver.findElement(By.xpath("//a[contains(text(),'Jobha green apple soap')]")).click();

		WebElement element = driver.findElement(By.xpath("//iframe[@title='chat widget']"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//div[@class='initial-message-bubble']/button")).click();
		driver.switchTo().defaultContent();

		driver.findElement(By.name("wk_zipcode")).sendKeys("444605");
		driver.findElement(By.xpath("//input[@value='Check']")).click();
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();

		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();

		driver.findElement(By.id("checkout")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.accept();

//		driver.findElement(By.xpath("//ul[@class='tmenu_nav']/li[6]")).click();
//		driver.findElement(By.xpath("//div[@class='container main_container']/div/div[2]/div[1]/a[1]/img")).click();
//

//
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Chekku Gingelly')]")).click();
//
//		driver.findElement(By.xpath("//div[@id='com-hextom-smartpushmarketing-modal']/div/div/div[2]/div[1]")).click();
	}

}
