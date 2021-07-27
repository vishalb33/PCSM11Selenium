import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://www.facebook.com/");
 		driver.manage() .window() .maximize();
 		WebElement email = driver.findElement(By.id("email"));
 		email.sendKeys("8551891234");
 		WebElement password = driver.findElement(By.id("pass"));
 		password.sendKeys("Vishal");
 		WebElement login = driver.findElement(By.name("login"));
 		login.click();
		//this change has been done in GitHub
	}

}
