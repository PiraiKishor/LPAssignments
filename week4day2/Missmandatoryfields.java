package homeassignments.week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Missmandatoryfields extends BaseSalesforce {
	@Test
	public void mandatemiss() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement viewbutton = driver.findElement(By.xpath("//button[text()='View All']"));
		wait.until(ExpectedConditions.elementToBeClickable(viewbutton));
		viewbutton.click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
//use javascript or action class
		
		WebElement opportunity = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click();", opportunity)	;	
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce automation by LakshmiPriya");
		String opportunityname = driver.findElement(By.xpath("//input[@name='Name']")).getText();
		System.out.println(opportunityname);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("9/8/2023");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String error = driver.findElement(By.xpath("//div[@class='panel-content scrollable']")).getText();
		System.out.println(error);
		
		
		
	}

}
