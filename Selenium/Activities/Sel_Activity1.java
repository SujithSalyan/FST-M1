package seleniumActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Activity1 {

	public static void main(String[] args) {
		// Create new instance of Webdriver
	WebDriver driver = new FirefoxDriver();
	
	
	//open the browser 
	driver.get("https://www.training-support.net");
	
	//close the browser
	driver.close();
	

	}

}
