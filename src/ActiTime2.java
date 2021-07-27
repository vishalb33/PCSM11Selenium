import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://demo.actitime.com/login.do");
 		driver.manage() .window() .maximize();
 		Thread.sleep(1000);
 		driver.findElement(By.linkText("Forgot your password?")).click();
 		Thread.sleep(1000);
 		driver.findElement(By.partialLinkText("login page")).click();
	}

}
