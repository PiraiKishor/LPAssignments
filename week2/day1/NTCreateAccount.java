package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTCreateAccount {

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
		WebElement ccy=driver.findElement(By.name("currencyUomId"));
		Select obj1=new Select(ccy);
		obj1.selectByValue("INR");
		driver.findElement(By.xpath("//textarea[@id=\"ext-gen629\"]")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id=\"groupNameLocal\"]")).sendKeys("localname1");
		driver.findElement(By.xpath("//input[@id=\"officeSiteName\"]")).sendKeys("sitename1");
		//one line
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select obj2=new Select(industry);
		obj2.selectByValue("IND_SOFTWARE");
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select obj3=new Select(ownership);
		obj3.selectByVisibleText("S-Corporation");
		WebElement source=driver.findElement(By.name("dataSourceId"));
		Select obj4=new Select(source);
		obj4.selectByValue("LEAD_EMPLOYEE");
		WebElement campaign=driver.findElement(By.name("marketingCampaignId"));
		Select obj5=new Select(campaign);
		obj5.selectByIndex(6);
		WebElement province=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select obj6=new Select(province);
		obj6.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		
		
	}

}
