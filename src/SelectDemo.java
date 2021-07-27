import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://www.facebook.com/");
 		driver.manage() .window() .maximize();
 		WebElement ele = driver.findElement(By.xpath(""));
 		Select s = new Select(ele);
 		//How to select multiple
 		if  (s.isMultiple())  {
 			s.selectByIndex(0);
 			Thread.sleep(1000);
 			s.selectByValue("323");
 			Thread.sleep(1000);
 			s.selectByVisibleText("324");
 		}
 		List<WebElement> values = s.getOptions();
 		for  (WebElement  value : values)  {
 			System.out.println(value.getText());
 		}
 		//How to Multiple deSelect
 		//s.deselectAll();
 		Thread.sleep(2000);
 		s.deselectByIndex(0);
 		Thread.sleep(1000);
 		s.deselectByValue("323");
 		Thread.sleep(1000);
 		s.deselectByVisibleText("324");
	}
}
