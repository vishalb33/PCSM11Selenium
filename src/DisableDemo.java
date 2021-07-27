import org.openqa.selenium.chrome.ChromeDriver;

public class DisableDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("file:///C:/Users/HP/Documents/ButtonCountshtml.html");
 		driver.manage() .window() .maximize();
	}

}
