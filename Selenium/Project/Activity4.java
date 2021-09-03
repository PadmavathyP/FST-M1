package Project_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
        String Title = driver.findElement(By.xpath("//*[@id=\"post-71\"]/div[2]/h3")).getText();
		
        boolean status = Title.contentEquals("Email Marketing Strategies");
		
		System.out.println("Title Matches: " + status);
		
		driver.close();

	}

}
