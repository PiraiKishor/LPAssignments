package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputComponents {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(
				By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']"))
				.sendKeys("Lakshmi Priya");
		String city = driver.findElement(By.xpath(
				"//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']"))
				.getAttribute("value");
		
		driver.findElement(By.xpath(
				"//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']"))
				.clear();
		System.out.println(city);
		
		Thread.sleep(200);
		
		driver.findElement(
				By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city']"))
				.sendKeys(city + ",India");
		String attributedisable = driver.findElement(By.xpath(
				"//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']"))
				.getAttribute("class");
		
		if (attributedisable.contains("disable")) {
			System.out.println("the text box is disabled");
		} else {
			System.out.println("the text box is not disabled");
		}
		driver.findElement(By.xpath(
				"(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[1]")).clear();

		
		
		driver.findElement(
				By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]"))
				.sendKeys("priyakishor2305@gmail.com");
		driver.findElement(
				By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]"))
				.sendKeys(Keys.TAB);
		Thread.sleep(300);
		String texttyped = driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[2]")).getAttribute("value");
		System.out.println(texttyped);
		driver.findElement(By.xpath("//textarea[@class='ui-inputfield ui-inputtextarea ui-widget ui-state-default ui-corner-all ui-inputtextarea-resizable']")).sendKeys("Hi,this is priya");
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Hi,Hello");
		driver.findElement( By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[3]")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*
		 * 
		 *  
		 * 
		 * 
		 * 
		 * Thread.sleep(500); String errormessage =
		 * driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).
		 * getText(); System.out.println("the error message is" + errormessage);
		 */

	}
}
