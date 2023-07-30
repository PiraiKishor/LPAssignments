package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnRadio {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='grid formgrid']/div/table/tbody/tr/td/div)[2]")).click();
		//did not select the option chennai
		driver.findElement(By.xpath("(//div[@class='ui-g']/div)[1]")).click();
		
	}

}
