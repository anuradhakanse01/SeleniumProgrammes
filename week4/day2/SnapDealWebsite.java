package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDealWebsite {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		Actions action = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		action.moveToElement(ele1).perform();

		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		WebElement ele2 = driver.findElement(By.xpath("//li[@class='child-cat-list cat-list ']/a/div[2]"));
		String text1 = ele2.getText();
		System.out.println(text1);

		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']/following::li)[2]"))
				.click();

		String text2 = driver.findElement(By.xpath("(//div[@class='lfloat marR10']/span[2])[1]"))
				.getAttribute("display-price").toString();
		String text3 = driver.findElement(By.xpath("(//div[@class='lfloat marR10']/span[2])[2]"))
				.getAttribute("display-price").toString();

		if (Integer.valueOf(text2) < Integer.valueOf(text3)) {
			System.out.println("Items are sorted correctly");
		}

		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");

		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='filter-color-tile Yellow ']")).click();
		String text = driver.findElement(By.xpath("//label[@for='Color_s-Yellow']/a")).getText();

		if (text.contains("Yellow")) {
			System.out.println("Colour filter is applied");
		}

		WebElement element = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		action.moveToElement(element).perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();

		String text4 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println(text4);

		String text5 = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(text5);

		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/shoe.png");
		FileUtils.copyFile(source, dest);

		driver.findElement(By.xpath("//div[@class='close close1 marR10']/i")).click();
		driver.close();

	}

}
