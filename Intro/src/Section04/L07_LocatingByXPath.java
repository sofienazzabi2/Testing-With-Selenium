package Section04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L07_LocatingByXPath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sofien\\Desktop\\Resources\\driver_v1\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver() ;
        
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/buttons.html");
        //driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div[1]/button/")).click();
        driver.findElement(By.xpath("//[@id=\'btn_one\']")).click();
        
 
	}

}