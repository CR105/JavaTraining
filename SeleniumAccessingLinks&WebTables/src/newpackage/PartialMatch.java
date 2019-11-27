package newpackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String baseUrl = "http://demo.guru99.com/test/link.html";					
		System.setProperty("webdriver.chrome.driver","/Users/carios/Documents/Librerías/chromedriver");					
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().fullscreen();
        
        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Title of page is: " + driver.getTitle());							
        driver.quit();
	}

}
