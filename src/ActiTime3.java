import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime3 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.get("https://demo.actitime.com/login.do");
 		driver.manage() .window() .maximize();
 		Thread.sleep(2000);
 		String user = ReadData.readCell("D:/Login.xlsx", "Sheet1", 1, 0);
 		String pass = ReadData.readCell("D:/Login.xlsx", "Sheet1", 1, 1);
 		driver.findElement(By.id("username")).sendKeys(user);
 		driver.findElement(By.name("pwd")).sendKeys(pass, Keys.ENTER);
	}

}
