package SeleniumPractice2023.Selenium2023;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String [] itemsNeeded= {"Brocolli","Cauliflower", "Cucumber", "Carrot"};
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	}
	
	public static void addItems(WebDriver driver, String [] itemsNeeded) {
		int j=0;
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++) {
			
			String[] name=products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			// convert array into arrayList for each search
			// check whether name you extracted is present on arraylist or not
			    
			List itemsNeededList=Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName)) {
				
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length)
					break;
			
			}	
		}
	}
}
