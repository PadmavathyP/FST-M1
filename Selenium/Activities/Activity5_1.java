package Activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String Title = driver.getTitle();
		System.out.println("Title of the page is: " +Title);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
		boolean status = element.isDisplayed();
		System.out.println("Check box is displayed: " +status);
		
		driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]")).click();
		
		System.out.println("Check box is displayed: " + element.isDisplayed());
		
		driver.close();
		
	}

}
