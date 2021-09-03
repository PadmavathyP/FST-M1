package Activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
     
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		String Title = driver.getTitle();
		System.out.println("The page title is: " +Title);
		
		driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[1]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[2]/input")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
		
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Welcome Back, admin"));
		
		System.out.println(driver.findElement(By.id("action-confirmation")).getText());
		
		driver.close();
		
	}

}
