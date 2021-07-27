import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.manage() .window() .maximize();
 		driver.navigate() .to("https://www.google.com/");
 		Robot r = new Robot();
 		r.keyPress(KeyEvent.VK_CONTROL);
 		r.keyPress(KeyEvent.VK_T);
 		r.keyRelease(KeyEvent.VK_T);
 		r.keyRelease(KeyEvent.VK_CONTROL);
	}

}
