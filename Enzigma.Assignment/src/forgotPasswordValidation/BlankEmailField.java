package forgotPasswordValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlankEmailField {

	public static void main(String[] args) throws InterruptedException {
		
		// Open the browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();
		
		//waiting condition
		Thread.sleep(2000);

		// Navigate to the URL
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		Thread.sleep(2000);

		// Click on Forgot Password text
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		Thread.sleep(2000);

		// Enter email into the text field
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("");
		Thread.sleep(2000);

		// Click on Proceed button
		driver.findElement(By.xpath("//div[text()='Proceed']")).click();
		Thread.sleep(2000);

		// Verify the error message
		WebElement error = driver.findElement(By.xpath("//h2[text()='Please enter email']"));
		Thread.sleep(2000);
		String emailError = error.getText();
		System.out.println(emailError);
		
		driver.quit();
	}

}
