package Project_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitvity5 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		driver.findElement(By.linkText("My Account")).click();
		
        String Title = driver.getTitle();
		
       boolean status = Title.contentEquals("My Account – Alchemy LMS");
		
		System.out.println("Title Matches: " + status);
		
		driver.close();


	}

}
