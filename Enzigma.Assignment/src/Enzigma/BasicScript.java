package Enzigma;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Waiting condition
		Thread.sleep(2000);
		
		//Navigate to the URL
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		Thread.sleep(2000);
		
		//Close the browser
		driver.quit();
	}

}

	
