package Section05;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L010_Assertion_pt2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sofien\\Desktop\\Resources\\driver_v1\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk");
		
		driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
		
		driver.findElement(By.linkText("TEST STORE")).click();
		driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
		driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
		
		//slow test down:
		Thread.sleep(2000);
		
		//variable stores the text total:
		String total = driver.findElement(By.cssSelector(".product-total > .value")).getText();
		
		//assertion checks the total with an expected amount (this example fails):
		Assert.assertEquals("$26.11", total);
		

	}

}