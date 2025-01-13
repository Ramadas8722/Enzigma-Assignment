package signupPageValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissingOrBlankMandatoryFields {

	public static void main(String[] args) throws InterruptedException {
		
		// Open the browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();
		
		//Waiting condition
		Thread.sleep(2000);

		// Navigate to the URL
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		Thread.sleep(2000);

		// Click on Sign up
		WebElement sign_up = driver.findElement(By.xpath("//a[text()='Sign up']"));
		sign_up.click();
		Thread.sleep(2000);

		// Write email in Email text field
		WebElement email = driver.findElement(By.xpath("(//input[@name='username'])[2]"));
		email.sendKeys("");
		Thread.sleep(2000);

		// Select check box
		WebElement checkbox = driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']"));
		checkbox.click();
		Thread.sleep(2000);

		// Click on Proceed button
		WebElement proceed = driver.findElement(By.xpath("//div[text()='Proceed']"));
		proceed.click();
		Thread.sleep(2000);
				
		String error = "Please enter email";
				
		WebElement message = driver.findElement(By.xpath("//h2[text()='Please enter email']"));
		String txt = message.getText();
				
		if (txt.contains(error)) {
			System.out.println("Please enter email");
		}
		driver.quit();
	}
}

	