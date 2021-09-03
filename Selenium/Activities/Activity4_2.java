package Activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		String Title = driver.getTitle();
		System.out.println("The Page title is: " + Title);
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		
		firstname.sendKeys("Padma");
		lastname.sendKeys("PP");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Padma@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("9789214567");
		driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[5]/textarea")).sendKeys("simple form");
		
		driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[1]/input")).click();
		
		driver.close();
		
	}

}
