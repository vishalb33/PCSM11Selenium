import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentRobot {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.manage() .window() .maximize();
 		driver.navigate() .to("https://www.google.com/");
 		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
 		search.sendKeys("java", Keys.ENTER);
 		Thread.sleep(2000);
 		WebElement java = driver.findElement(By.xpath("//h2/span[contains(.,'Java')]"));
 		Actions a = new Actions(driver);
 		a.doubleClick(java) .perform();
 		Thread.sleep(2000);
 		Robot r = new Robot();
 		r.keyPress(KeyEvent.VK_CONTROL);
 		r.keyPress(KeyEvent.VK_C);
 		Thread.sleep(2000);
 		r.keyPress(KeyEvent.VK_CONTROL);
 		r.keyPress(KeyEvent.VK_T);
 		r.keyPress(KeyEvent.VK_CONTROL);
 		r.keyPress(KeyEvent.VK_V);
 		r.keyPress(KeyEvent.VK_ENTER);
 		r.keyRelease(KeyEvent.VK_CONTROL);
 		r.keyRelease(KeyEvent.VK_ENTER);
 		r.keyRelease(KeyEvent.VK_C);
 		r.keyRelease(KeyEvent.VK_T);
 		r.keyRelease(KeyEvent.VK_V);
	}
}
