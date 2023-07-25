package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("WIPRO");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
		WebElement source=driver.findElement(By.name("dataSourceId"));
		Select obj1=new Select(source);
		obj1.selectByVisibleText("Employee");
		WebElement markcampid=driver.findElement(By.name("marketingCampaignId"));
		Select obj2=new Select(markcampid);
		obj2.selectByValue("9001");
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select obj3=new Select(ownership);
		obj3.selectByIndex(5);
		WebElement country=driver.findElement(By.name("generalCountryGeoId"));
		Select obj4=new Select(country);
		obj4.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
	}

}
