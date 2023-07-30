package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Lakshmi");
		driver.findElement(By.id("lastNameField")).sendKeys("Priya");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Pirai");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Mathi");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("department1");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("description1");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("priyakishor2305@gmail.com");
		WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj1= new Select(state);
		obj1.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("important note");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		}

}
