package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOne {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("Frames in selenium");

		driver.switchTo().frame("frame3");

		WebElement element = driver.findElement(By.xpath("//input[@type='checkbox']"));

		boolean enabled = element.isSelected();
		System.out.println(enabled);

		if (!enabled) {
			element.click();
		}

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='frame2']")));
		WebElement element2 = driver.findElement(By.id("animals"));
		Select select = new Select(element2);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement ele : allSelectedOptions) {
			System.out.println(ele.getText());
		}

		select.selectByVisibleText("Big Baby Cat");
		System.out.println(select.getFirstSelectedOption().getText());

	}

}
