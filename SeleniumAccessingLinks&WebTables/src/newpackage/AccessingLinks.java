package newpackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingLinks {

	public static void main(String[] args) {									
        String baseUrl = "http://demo.guru99.com/test/link.html";					
        System.setProperty("webdriver.chrome.driver","/Users/carios/Documents/Librerías/chromedriver");					
        WebDriver driver = new ChromeDriver();					

        driver.manage().window().fullscreen();
        
        driver.get(baseUrl);					
        driver.findElement(By.linkText("click here")).click();					
        System.out.println("title of page is: " + driver.getTitle());							
        driver.quit();			
    }		

}
