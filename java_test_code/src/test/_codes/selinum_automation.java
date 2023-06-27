package test._codes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
@SuppressWarnings("unused")
public class selinum_automation{
	   @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		   WebDriverManager.chromedriver().setup();    
		   ChromeDriver driver = new ChromeDriver();
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://accounts.google.com/signin");
	      //identify email
	      WebElement l = driver
	      .findElement(By.name("identifier"));
	      l.sendKeys("satish877784@gmail.com");
	      WebElement b = driver
	      .findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
	      b.click();
	      //identify password
	      WebElement p = driver
	      .findElement(By.name("password"));
	      p.sendKeys("sa135@nm1");
	      b.click();
	      //close browser
	      driver.close();
	   }
	}


