import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertQADemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://demoqa.com/alerts");
 		driver.manage() .window() .maximize();
 		driver.manage() .timeouts() .implicitlyWait(10, TimeUnit.SECONDS);
 		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
 		Thread.sleep(2000);
 		Alert a = driver.switchTo() .alert();
 		Thread.sleep(2000);
 		System.out.println(a.getText());
 		a.accept();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
 		Thread.sleep(2000);
 		Alert b = driver.switchTo() .alert();
 		Thread.sleep(2000);
 		System.out.println(b.getText());
 		b.dismiss();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
 		Thread.sleep(2000);
 		Alert c = driver.switchTo() .alert();
 		Thread.sleep(2000);
 		System.out.println(b.getText());
 		Thread.sleep(2000);
 		c.sendKeys("Vishal");
 		Thread.sleep(2000);
 		c.accept();
 		Thread.sleep(2000);
 		WebElement errText = driver.findElement(By.id("confirmResult"));
 		System.out.println(errText.getText());
	}

}
