package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Activity4_2 {

	public static void main(String[] args) {
		//Create Firefox Webdriver Instance 
		
		WebDriver driver = new FirefoxDriver();
		
		// Open the website
		
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Title of the Home page is :"+title);
		
		//Find the locator for first two text boxes and key in the data
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		
	    firstName.sendKeys("Sujith");
	    lastName.sendKeys("Salyan");
	    
	    //Find locators for the remaining two text boxes and key in the data
	    
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ss@testing.com");
	    driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("1234567890");
	    
	    //Enter the message 
	    
	    driver.findElement(By.xpath("//textarea")).sendKeys("Testing");
	    
	    //Submit 
	    
	     driver.findElement(By.xpath("//div/div[6]/div[1]/input")).click();
	     
	    }

}
