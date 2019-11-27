package newproject;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/carios/Documents/Librerías/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().fullscreen();
        driver.get("http://www.popuptest.com/popuptest2.html");
        driver.quit();  // using QUIT all windows will close
	}

}
