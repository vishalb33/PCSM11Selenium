import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://demo.guru99.com/test/upload");
 		driver.manage() .timeouts() .implicitlyWait(10, TimeUnit.SECONDS);
 		driver.manage() .window() .maximize();
 		Thread.sleep(2000);
 		driver.findElement(By.id("file_wraper0")).click();
 		Thread.sleep(2000);
 		
	}

}
