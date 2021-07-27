import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeAuthentication {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://demo.actitime.com/login.do");
 		driver.manage() .timeouts() .implicitlyWait(10, TimeUnit.SECONDS);
 		driver.manage() .window() .maximize();
 		Thread.sleep(2000);
 		driver.findElement(By.name("username")).sendKeys("admin");
 		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support popup_menu_button_pressed']")).click();
 		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
	}

}
