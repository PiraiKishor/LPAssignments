package week2.day2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//ul[@class='x-tab-strip x-tab-strip-top'])/li[2]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9677");
		driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		Thread.sleep(3000);
		List<WebElement> text = driver.findElements(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"));
		System.out.println(text.size());
		
		for(int i=0;i<text.size();i++)
		{
			String text2 = text.get(i).getText();
			System.out.println(text2);
			Thread.sleep(500);
			
			
		}
		String text3 = text.get(0).getText();
		System.out.println("the first captured id is"+text3);
		text.get(0).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//Thread.sleep(300);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text3);
		//driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys(text3);
		driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		Thread.sleep(300);
		String searchresult = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(searchresult);
		if(searchresult.equals("No records to display")){
			
			System.out.println("Lead is deleted successfully");
			
		}
		else
			System.out.println("Lead is not deleted successfully");
		driver.close();
		}
	
	
		
		
		
	}


