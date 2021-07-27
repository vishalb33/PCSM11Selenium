import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
     public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.manage() .window() .maximize();
 		driver.navigate() .to("https://www.google.com/");
 		String title = driver.getTitle();
 		System.out.println(title);
 		String url = driver.getCurrentUrl();
 		System.out.println(url);
 		String pagesource = driver.getPageSource();
 		System.out.println(pagesource);
 		Thread.sleep(2000);
 		//driver.close();
 		driver.quit();
	}

}
