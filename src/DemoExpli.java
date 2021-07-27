import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExpli {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://demo.actitime.com/login.do");
 		driver.manage() .window() .maximize();
 		driver.manage() .timeouts() .implicitlyWait(10, TimeUnit.SECONDS);
 		driver.findElement(By.id("username")) .sendKeys("admin");
 		driver.findElement(By.name("pwd")) .sendKeys("manager", Keys.ENTER);
 		WebElement logout = driver.findElement(By.id("logoutLink"));
 		WebDriverWait ww = new WebDriverWait (driver, 10);
 		ww.until(ExpectedConditions.titleContains("Enter"));
 		logout.click();
	}

}
