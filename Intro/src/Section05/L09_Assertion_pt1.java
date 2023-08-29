package Section05;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class L09_Assertion_pt1 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sofien\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk");
        
        String pageTitle  =  driver.getTitle();
        assertEquals("Homepage", pageTitle);
     
        
    
        }

}