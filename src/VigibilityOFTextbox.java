import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VigibilityOFTextbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("file:///C:/Users/HP/Documents/VisiblityOftext.html");
 		driver.manage() .window() .maximize();
 		driver.manage() .timeouts() .implicitlyWait(10, TimeUnit.SECONDS);
 		WebElement ele = driver.findElement(By.id("iamtextbox"));
 		WebDriverWait ww = new WebDriverWait(driver, 10);
 		ww.until(ExpectedConditions.visibilityOf(ele));
 		ele.sendKeys("vishal");
	}

}
