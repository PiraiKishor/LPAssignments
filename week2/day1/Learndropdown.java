package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learndropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
		WebElement soel1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceel1=new Select(soel1);
		sourceel1.selectByVisibleText("Existing Customer");
		WebElement soel2=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sourceel2 = new Select(soel2);
		sourceel2.selectByIndex(5);
		WebElement soel3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sourceel3=new Select(soel3);
		sourceel3.selectByValue("OWN_CCORP");
		WebElement soel4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select sourceel4=new Select(soel4);
		sourceel4.selectByVisibleText("INR - Indian Rupee");
		driver.findElement(By.className("smallSubmit")).click();
		
		
	}

}
