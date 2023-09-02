package Section12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L05_Login extends L05_BasePage {
	
    public L05_Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void signin() throws InterruptedException, IOException {
    	
    	driver = this.getDriver();
    	driver.get(this.getUrl());
		
    	driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("hahahahahahhaha@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("2t5GtYGJk4TNAdL");
		driver.findElement(By.cssSelector("button#submit-login")).click();
		
		takeSnapShot(driver);
		
		System.out.println("User has logged in");
		 Thread.sleep(2000);
	}

}
