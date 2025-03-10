package Activities_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		String Title = driver.getTitle();
		System.out.println("The page title is: " + Title);
		
		driver.findElement(By.cssSelector("button#simple")).click();
		 
        
        Alert simpleAlert = driver.switchTo().alert();
 
        //Get text in the alert box and print it
        String alertText = simpleAlert.getText();
        System.out.println("Alert text is: " + alertText);
 
        //Close the alert box
        simpleAlert.accept();
 
        //Close the Browser
        driver.close();

	}

}
