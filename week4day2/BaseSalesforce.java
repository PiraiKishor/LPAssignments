package homeassignments.week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSalesforce {
	ChromeDriver driver;
	@BeforeMethod
	public void login()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		 driver = new ChromeDriver(opt);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//span[@class='uiImage']")).click();
		driver.findElement(By.xpath("//a[@class='profile-link-label logout uiOutputURL']")).click();
		driver.close();
	}

}
