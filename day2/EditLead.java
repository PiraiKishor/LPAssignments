package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Bhuvaneshwari");
		driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		String text="new description added";
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).sendKeys(text);
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String text1 = driver.findElement(By.xpath("//span[@id='viewLead_description_sp']")).getText();
		System.out.println(text1);
		if(text.equals(text1)) {
			System.out.println("Lead is successfully updated");
		}
		
				
	}

}
