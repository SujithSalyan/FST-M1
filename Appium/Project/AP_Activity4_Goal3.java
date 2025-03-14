package Appium_ProjectWork;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AP_Activity4_Goal3 {

	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 4 API 28");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		// Instantiate Appium Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 5);

		driver.get("https://www.training-support.net/selenium");
	}

	@Test
	public void testCredentials() throws Exception {
		
		
		Assert.assertEquals(testingSimpleLoginPopups("admin","password"), "Welcome Back, admin");
		
		Assert.assertEquals(testingSimpleLoginPopups("admin","Password"), "Invalid Credentials");
	}
	
	private String  testingSimpleLoginPopups(String username, String password) throws Exception {

		try {
			driver.findElement(
					MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
		} catch (InvalidSelectorException e) {
			
		}
		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(MobileBy.AndroidUIAutomator("textContains(\"Popups\")")))
				.click();
		//Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("textContains(\"Sign In\")")))
		.click();
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceId(\"username\")")))
		.sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceId(\"password\")")))
		.sendKeys(password);
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("textContains(\"Log in\")")))
				.click();
		Thread.sleep(3000);
		String message = wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("resourceId(\"action-confirmation\")"))).getText();
		System.out.println("Message: "+ message);
		return message;
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}