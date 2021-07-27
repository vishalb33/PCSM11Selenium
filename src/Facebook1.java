import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver ();
 		driver.navigate() .to("https://www.facebook.com/");
 		driver.manage() .window() .maximize();
 		Thread.sleep(2000);
 		WebElement create = driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']"));
 		create.click();
 		Thread.sleep(2000);
 		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
 		firstname.sendKeys("Vishal");
 		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
 		lastname.sendKeys("Birajdar");
 		Thread.sleep(2000);
 		WebElement mail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
 		mail.sendKeys("vishalb3351@gmail.com");
 		Thread.sleep(2000);
 		WebElement confurm = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
 		confurm.sendKeys("vishalb3351@gmail.com");
 		Thread.sleep(2000);
 		WebElement pass = driver.findElement(By.xpath("//input[@id='password_step_input']"));
 		pass.sendKeys("123654789");
 		Thread.sleep(2000);
 		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
 		date.sendKeys("20", Keys.ENTER);
 		Thread.sleep(2000);
 		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
 		month.sendKeys("Jun", Keys.ENTER);
 		Thread.sleep(2000);
 		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
 		year.sendKeys("1995", Keys.ENTER);
 		Thread.sleep(2000);
 		WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
 		gender.click();
 		WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
 		signup.click();
	}
}