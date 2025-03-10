package Project_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		driver.findElement(By.linkText("Contact")).click();
		
		driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_0\"]")).sendKeys("Padma");
		driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_1\"]")).sendKeys("padma@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_3\"]")).sendKeys("Java");
		driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_2\"]")).sendKeys("This is new message");
		
		driver.findElement(By.xpath("//*[@id=\"wpforms-submit-8\"]")).click();
		
        String message = driver.findElement(By.xpath("//*[@id=\"wpforms-confirmation-8\"]/p")).getText();
		
        
		
		System.out.println("Message displayed: " + message);
		
		driver.close();
		
		

	}

}
