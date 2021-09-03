package Activities_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement element = driver.findElement(By.id("single-select"));
		Select select = new Select(element);
		
		select.selectByVisibleText("Option 2");
		select.selectByIndex(2);
		select.selectByValue("4");
		
		List <WebElement> elements = select.getOptions();
		for (WebElement i : elements)
		{
			System.out.println(i.getText());
		}
		
		driver.close();

	}

}
