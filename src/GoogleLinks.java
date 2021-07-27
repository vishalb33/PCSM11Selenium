import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://www.google.com/");
 		driver.manage() .window() .maximize();
 		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
 		search.sendKeys("java", Keys.ENTER);
 		Thread.sleep(2000);
	}

}
