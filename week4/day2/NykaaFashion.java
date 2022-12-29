package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaaFashion {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		WebElement element = driver.findElement(By.xpath("//div[@id='headerMenu']//ul[2]/li/a"));

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

		driver.findElement(By.xpath("//div[@id='brandCont_Popular']/ul/li[5]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'customer top rated')]")).click();

//		driver.findElement(By.xpath("//div[@id='first-filter']//div[@class='css-xdicx1']")).click();
//		driver.findElement(By.xpath("//span[text()='Hair']")).click();
//		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
//		driver.findElement(By.xpath("//label[@for='checkbox_Shampoo_316']/div[2]")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='sidebar__inner']/div/div[1]")).click();
		driver.findElement(By.xpath("//ul[@id='custom-scroll']//li[2]")).click();
		driver.findElement(By.xpath("//ul[@class='scroll css-1e7z8zv']//li[1]")).click();

		driver.findElement(By.xpath("//label[@for='checkbox_Shampoo_316']/div[2]")).click();

		driver.findElement(By.xpath("//span[text()='Concern']")).click();

		driver.findElement(By.xpath("//label[@for='checkbox_Color Protection_10764']")).click();

		String text = driver.findElement(By.xpath("//div[@class='css-rtde4j']/div[1]/span")).getText();
		System.out.println(text);
		if (text.equals("Shampoo")) {
			System.out.println("Filter is applied");
		} else {
			System.out.println("Filter is not applied");
		}

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo')]")).click();

		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(handles);
		driver.switchTo().window(list.get(1));

		String text2 = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e']/span[contains(text(),'189')])[1]"))
				.getText();
		System.out.println("MRP is " + text2);

		driver.findElement(By.xpath("//div[@class='css-vp18r8']/button")).click();
		driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']/button")).click();

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(frame);

		WebElement element2 = driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span"));
		String text4 = element2.getText();
		System.out.println("Grand total is : " + text4);

		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']/img")).click();

		WebElement element3 = driver.findElement(By.xpath("//p[@class='css-cla92e eka6zu20']"));
		String text3 = element3.getText();
		System.out.println("Final grand total is : " + text3);

		if (text4.equals(text3)) {
			System.out.println("Grand total and Final grand total is same");
		} else {
			System.out.println("Grand total and Final grand total is not same");
		}

		driver.quit();

	}

}
