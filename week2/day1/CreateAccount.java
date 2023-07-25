package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id=\"groupNameLocal\"]")).sendKeys("Localname1");
		driver.findElement(By.xpath("//input[@id=\"officeSiteName\"]")).sendKeys("sitename1");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("500000");
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select obj1=new Select(industry);
		obj1.selectByValue("IND_SOFTWARE");
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select obj2=new Select(ownership);
		obj2.selectByVisibleText("S-Corporation");
		WebElement source=driver.findElement(By.name("dataSourceId"));
		Select obj3=new Select(source);
		obj3.selectByValue("LEAD_EMPLOYEE");
		WebElement markcamp=driver.findElement(By.name("marketingCampaignId"));
		Select obj4=new Select(markcamp);
		obj4.selectByIndex(6);
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select obj5=new Select(state);
		obj5.selectByValue("TX");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		
		
	}

}
