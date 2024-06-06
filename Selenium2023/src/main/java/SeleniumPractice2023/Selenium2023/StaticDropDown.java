package SeleniumPractice2023.Selenium2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select select = new Select(staticDropdown);
		select.selectByIndex(2);
		System.out.println(select.getFirstSelectedOption().getText());
		
		select.selectByVisibleText("USD");
		System.out.println(select.getFirstSelectedOption().getText());
		
		select.selectByValue("INR");
		System.out.println(select.getFirstSelectedOption().getText());
		driver.close();
	}

}
