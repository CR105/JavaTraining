package newproject;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/carios/Documents/Librerías/chromedriver");
        WebDriver driver = new ChromeDriver();
        String alertMessage = "";

        driver.manage().window().fullscreen();
        
        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        driver.quit();
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
        Path currentDir = Paths.get(".");
        System.out.println(currentDir.toAbsolutePath().getParent().getParent() + "/Libraries");
       
    }

}
