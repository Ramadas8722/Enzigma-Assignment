package LoginPageValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageValidation {

	public static void main(String[] args) throws InterruptedException {
		
		// Open the browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();
		
		//Waiting Condition
		Thread.sleep(2000);

		// Navigate to the URL
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		Thread.sleep(2000);
		
		//Enter email in Email text field
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("ramdaspkundekar8722@gmail.com");
		 Thread.sleep(2000);
		 		
		 //Enter password into the Password text field
		 WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys("8722713492@Ramu");
		 Thread.sleep(2000);
		 		
		 //Click on Login button
		 WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
		 login.click();
		 Thread.sleep(2000);
		 driver.quit();

		}

}

	
