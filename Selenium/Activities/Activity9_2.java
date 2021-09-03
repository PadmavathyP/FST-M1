package Activities_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement element = driver.findElement(By.id("multi-select"));
		Select select = new Select(element);
		
		if(select.isMultiple()) {
			
			select.selectByVisibleText("Javascript");
			System.out.println(element.getText());
			
			select.selectByValue("node");
			select.selectByIndex(3);
			select.selectByIndex(4);
			select.selectByIndex(5);
			select.deselectByValue("node");
			select.deselectByIndex(6);
			
			List<WebElement> selectedOptions = select.getAllSelectedOptions();
            
            for(WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }
            
            
            select.deselectAll();
            System.out.println(element.getText());
        }        
       
        driver.close();
			
		}

	}

