package newpackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseSensitivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://demo.guru99.com/test/newtours/";					
		System.setProperty("webdriver.chrome.driver","/Users/carios/Documents/Librerías/chromedriver");					
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().fullscreen();
        		
        driver.get(baseUrl);					
        String theLinkText = driver.findElement(By					
                .partialLinkText("egis"))			
                .getText();		
        System.out.println(theLinkText);					
        theLinkText = driver.findElement(By					
                .partialLinkText("EGIS"))			
                .getText();		
        System.out.println(theLinkText);

        driver.quit();

	}

}
