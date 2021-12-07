package org.testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@Test(dataProvider="loginData")
	private void facebookLogin(String name, String pass) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		driver.close();
		
	}
	
	@DataProvider(name="loginData", parallel=true)
	private Object[][] data() {
		return new Object[][] {{"venkat", "venkat18"}, {"vicky", "vicky18"}, {"vj", "vj18"}};
	}
	
	
}
