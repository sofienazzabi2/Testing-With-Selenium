package Section04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L03_LocatingByName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sofien\\Desktop\\Resources\\driver_v1\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver() ;
        
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/contactForm.html");
        driver.findElement(By.name("first_name")).sendKeys("abcd");
 
	}

}
