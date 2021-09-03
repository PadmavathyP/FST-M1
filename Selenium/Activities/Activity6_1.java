package Activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String Title = driver.getTitle();
		System.out.println("Title of the page is: " +Title);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
		element.click();
		
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("toggled")));
		
		driver.findElement(By.id("toggleCheckbox")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("toggled")));
		
		driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input")).click();
		
		driver.close();
		
	}

}
