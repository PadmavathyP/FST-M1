package Project_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activtiy2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		String Title = driver.findElement(By.xpath("//*[@id=\"uagb-infobox-74cd79b6-b855-4e72-81bc-e70591de1896\"]/div/div/div/div[1]/h1")).getText();
		
        boolean status = Title.contentEquals("Learn from Industry Experts");
		
		System.out.println("Title Matches: " + status);
		
		driver.close();

	}

}
