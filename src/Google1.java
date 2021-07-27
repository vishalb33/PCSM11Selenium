import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://www.google.com/");
 		driver.manage() .window() .maximize();
 		WebElement search = driver.findElement(By.name("q"));
 		search.sendKeys("aliya");
	}

}
