import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleScroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.manage() .window() .maximize();
 		driver.get("https://www.google.com/");
 		WebElement search = driver.findElement(By.name("q"));
 		System.out.println(search.isDisplayed());
 		System.out.println("is Enable :" +search.isEnabled());
 		search.sendKeys("java", Keys.ENTER);
 		Thread.sleep(2000);
 		
 		JavascriptExecutor js = (JavascriptExecutor) driver;
 		/*js.executeScript("window.scrollTo(0, document.body.scrollWidth)");
 		Thread.sleep(2000);
 		js.executeScript("window.scrollTo(0, -document.body.scrollWidth)");
 		*/
 		WebElement ele = driver.findElement(By.xpath("//h3[text ()='OpenJDK - Java.net']"));
 		js.executeScript("arguments[0].scrollIntoView()",ele);
	}

}
