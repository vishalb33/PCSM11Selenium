import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoJavaScriptExe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.get("https://www.google.com/");
 		driver.manage() .window() .maximize();
 		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
 		search.sendKeys("java", Keys.ENTER);
 		Thread.sleep(2000);
 		JavascriptExecutor js = (JavascriptExecutor) driver;
 		js.executeScript("window.scrollBy(0,1000)");
 		Thread.sleep(2000);
 		js.executeScript("window.scrollBy(0,-500)");
	}

}
