package Activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String Title = driver.getTitle();
		System.out.println("Page title is: " +Title);
		
		WebElement textfield = driver.findElement(By.xpath("//input[@type='text']"));
		boolean status = textfield.isEnabled();
		System.out.println("Text field is enabled: " + status);
		
		driver.findElement(By.id("toggleInput")).click();
		
		System.out.println("Text field is enabled: " + textfield.isEnabled());
		
		driver.close();

	}

}
