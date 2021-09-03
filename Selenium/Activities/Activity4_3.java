package Activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		String Title = driver.getTitle();
		System.out.println("Page title is: " + Title);
		
		String thirdHeader = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
		System.out.println("Third header is: "+ thirdHeader);
		
		String fifthHeader = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color");
		System.out.println("Colour of fifth header is:" + fifthHeader);
		
		String violetClasses = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");
		System.out.println("The clases of violetClasses is: " +violetClasses);
		
		String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("Content of grey colour button is: " + greyButton);
		
		driver.close();
		}

}
