package LoginPageValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialCharacter {

	public static void main(String[] args) throws InterruptedException {
		
		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();
		
		//Waiting condition
		Thread.sleep(2000);

		// Navigate to the URL
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		Thread.sleep(2000);

		// Enter email in Email text field
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("@@@");
		Thread.sleep(2000);

		// Enter password into the Password text field
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("$%");
		Thread.sleep(2000);

		// Click on Login button
		WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
		login.click();
		Thread.sleep(2000);
				
		String error = "Please enter a valid email";

		WebElement message = driver.findElement(By.xpath("//h2[text()='Please enter a valid email']"));
		Thread.sleep(2000);
		String txt = message.getText();

		if (txt.contains(error)) {
			System.out.println(error);

		}
		driver.quit();

	}
}
