package Activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net");
		
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
		
		String NewTitle = driver.getTitle();
		System.out.println("Title in new page is: " + NewTitle);
		
		driver.close();
		
			}

}
