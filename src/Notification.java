import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
 		ChromeDriver driver = new ChromeDriver (co);
 		driver.navigate() .to("https://www.justdial.com/");
 		driver.manage() .window() .maximize();
 		driver.manage() .timeouts() .implicitlyWait(10, TimeUnit.SECONDS);
	}

}
