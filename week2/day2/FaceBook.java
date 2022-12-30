package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.findElement(By.xpath("//div[@class='_6ltg'][2]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Jack");
		driver.findElement(By.name("lastname")).sendKeys("Sparrow");
		driver.findElement(By.name("reg_email__")).sendKeys("8745673243");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Anuradha@1996");

		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByValue("9");

		WebElement month = driver.findElement(By.id("month"));
		Select select1 = new Select(month);
		select1.selectByValue("10");

		WebElement year = driver.findElement(By.id("year"));
		Select select2 = new Select(year);
		select2.selectByValue("1996");

		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][1]/input")).click();

	}

}
