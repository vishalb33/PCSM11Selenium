
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchToConsole {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://www.google.com/");
 		driver.manage() .window() .maximize();
 		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
 		search.sendKeys("java");
 		System.out.println(search.isDisplayed());
 		System.out.println("is Enabled :" + search.isEnabled());
 		Thread.sleep(2000);
 		search.clear();
 		Thread.sleep(2000);
 		List<WebElement> fetch = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
 		for  (WebElement fetchs : fetch )  {
 			System.out.println(fetchs.getText());
 		}
 		fetch.get(2).click();
	}

}
