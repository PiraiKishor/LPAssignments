package homeassignments.week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testngpractice {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();

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
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce automation by LakshmiPriya");
		String opportunityname = driver.findElement(By.xpath("//input[@name='Name']")).getText();
		System.out.println(opportunityname);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("8/8/2023");
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		WebElement needanalysis = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']"));
		driver.executeScript("arguments[0].click();", needanalysis)	;
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String text = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce automation by LakshmiPriya']")).getText();
	if (text.equals("Salesforce automation by LakshmiPriya")) {
		System.out.println("Opportunity name is verified");
		
	}
	
	
	
	
	
	}

}
