package homeassignments.week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ArchitectCertifications extends BaseSalesforce {
	@Test
	public void certifications() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		String currentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(allwindows);
		String parentwindow = window.get(0);
		String childwindow = window.get(1);
		driver.switchTo().window(childwindow);
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span[text()='Learning']").click();

		WebElement trailhead = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		String trailheadtext = trailhead.getText();
		System.out.println(trailheadtext);
		Actions act = new Actions(driver);
		act.moveToElement(trailhead).perform();

		WebElement certification = shadow.findElementByXPath("//a[text()='Salesforce Certification']");

		System.out.println(certification.getText());
		act.scrollByAmount(0, 100);

		act.moveToElement(certification).click().perform();
		WebElement SA = driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]"));
		String role = SA.getText();
		
		SA.click();
		String myrole = role.replace("/n", "");
		System.out.println("My role is" + myrole);

		List<WebElement> certitle = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (int i = 0; i < certitle.size(); i++) {
			System.out.println(certitle.get(i).getText());
		}
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
	
		List<WebElement> apparchcert = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (int i = 0; i < apparchcert.size(); i++) {
			System.out.println((apparchcert.get(i).getText()));
			
		}
		

	}
}

