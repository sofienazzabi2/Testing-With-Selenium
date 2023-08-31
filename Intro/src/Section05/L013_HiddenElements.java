package Section05;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L013_HiddenElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sofien\\Desktop\\Resources\\driver_v1\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://automationtesting.co.uk");
		
		driver.findElement(By.linkText("ACCORDION")).click();
		
		for (int i = 0;i<10;i++) {
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
			Thread.sleep(1000);
			
		}
		
		
		
	
		

	}

}