import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://jqueryui.com/slider/");
 		driver.manage() .window() .maximize();
 		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
 		driver.switchTo() .frame(frame);
 		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
 		Actions a = new Actions(driver);
 		a.dragAndDropBy(slider, 50, 0) .perform();
	}

}
