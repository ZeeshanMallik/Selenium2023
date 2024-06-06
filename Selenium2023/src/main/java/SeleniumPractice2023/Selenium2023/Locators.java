package SeleniumPractice2023.Selenium2023;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("inputUsername")).sendKeys("Zeeshan");
		driver.findElement(By.name("inputPassword")).sendKeys("malik");
		
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println("Executed succesfully");
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Zeeshan");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahul@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("ragahha@gmail.com");
		//Using index in css
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		
		//using parent to child tag
		System.out.println(driver.findElement(By.xpath("//form/h2")).getText());
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahulshetty@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9900990099");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		// driver.findelement by xpath css selector and maven installation chromedriver firefoxdriver internet 
		//input[@id='chkboxOne']
	
	}
}