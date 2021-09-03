package Activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String Title = driver.getTitle();
		System.out.println("Page title is: " +Title);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
		boolean status = element.isSelected();
		System.out.println("Check box is selected: " +status);
		
		element.click();
		
		System.out.println("Check box is selected: " + element.isSelected());
		
		driver.close();

	}

}
