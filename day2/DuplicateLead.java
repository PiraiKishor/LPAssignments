package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("lakshmi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String firstname = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).getText();
		System.out.println(firstname);
		String lastname = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-lastName'])[1]/a")).getText();
		String name=firstname+lastname;
		System.out.println(name);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Duplicate Lead"))
				{
			System.out.println("Title is verified");
				}
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("new description");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//span[@id='viewLead_firstNameLocal_sp']")).getText();
		System.out.println(text);
		if(name.contains(text))
		{
			System.out.println("the duplicated lead name is same as captured name");
		}
		else
		{
			System.out.println("the duplicated lead name is not the same as captured name");
		}
		
			
		
	}
	
	

}
