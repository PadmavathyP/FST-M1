package Activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/ajax");
		
		String Title = driver.getTitle();
		System.out.println("Page title is: " +Title);
		
		driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button")).click();
		
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ajax-content\"]/h1")));

		System.out.println(driver.findElement(By.id("ajax-content")).getText());
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/h3")).getText());
	
	    driver.close();
	}
	

}
