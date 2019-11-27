package newpackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;		
import java.util.concurrent.TimeUnit;		
import org.openqa.selenium.*;

public class AllLinks {

	public static void main(String[] args) {									
        String baseUrl = "http://demo.guru99.com/test/newtours/";					
        System.setProperty("webdriver.chrome.driver","/Users/carios/Documents/Librerías/chromedriver");					
        WebDriver driver = new ChromeDriver();	
        
        driver.manage().window().fullscreen();
        		
        String underConsTitle = "Under Construction: Mercury Tours";					
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

		driver.get(baseUrl);					
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
        String[] linkTexts = new String[linkElements.size()];							
		int i = 0;					

		//extract the link texts of each link element		
		for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();							
			i++;			
        }		

		//test each link		
		for (String t : linkTexts) {
			System.out.println("The text link is:" + t);
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals(underConsTitle)) {
				System.out.println("\"" + t + "\""
                    + " is under construction.");
				driver.navigate().back();
			} else {
				System.out.println("\"" + t + "\""
                    + " is working.");
				driver.navigate().back();
			}
        }
		driver.quit();			
    }		

}
