
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://www.facebook.com/");
 		driver.manage() .window() .maximize();
 		Thread.sleep(2000);
 		WebElement create = driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']"));
 		create.click();
 		Thread.sleep(2000);
 		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
 		Select s = new Select(day);
 		s.selectByVisibleText("20");
 		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
 		Select s1 = new Select(month);
 		s1.selectByValue("11");
 		List<WebElement> months = s.getOptions();
 		for (WebElement mon : months) {
 			System.out.println(mon.getText());
 		}
 		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
 		Select s2 = new Select(year);
 		s2.selectByValue("1994");
 		WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
 		male.click();
 		Thread.sleep(2000);
 		System.out.println("Gender click is " + male.isSelected());
 		System.err.println(male.getTagName());
 		Point loc = male.getLocation();
 		System.out.println();
	}
}
