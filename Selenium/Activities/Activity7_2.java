package Activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		String Title = driver.getTitle();
		System.out.println("The page title is: " +Title);
		
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("Padma");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[3]/input")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[4]/input")).sendKeys("padma@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		
		WebDriverWait wait = new WebDriverWait (driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation") , "Thank you for registering, Padma"));
		
		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        
        driver.close();
	}

}
