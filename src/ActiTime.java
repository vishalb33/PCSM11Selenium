import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://demo.actitime.com/login.do");
 		driver.manage() .window() .maximize();
 		WebElement email = driver.findElement(By.name("username"));
 		email.sendKeys("admin");
 		WebElement password = driver.findElement(By.name("pwd"));
 		password.sendKeys("manager");
 		WebElement login = driver.findElement(By.id("loginButton"));
 		login.click();
	}

}
