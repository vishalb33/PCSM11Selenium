import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.manage() .window() .maximize();
 		driver.navigate() .to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
