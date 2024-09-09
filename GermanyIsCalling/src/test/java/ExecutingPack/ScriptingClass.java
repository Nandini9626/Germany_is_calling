package ExecutingPack;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

public class ScriptingClass extends ReusedClass {
	void ValidLogin() throws InterruptedException, IOException {
		driver.get(obj.getProperty("URL"));
		XP("XUN").sendKeys(obj.getProperty("VUN"));
		XP("XPW").sendKeys(obj.getProperty("VPW"));
		SS("Valid credentials");
		XP("XLN").click();
		System.out.println("While login with valid credentials:");
		System.out.println("Successfully Login");
		SS("Home page");
		time(2);
		XP("XNN").click();
		time(2);
		SS("Logout");
		XP("XLG").click();
		time(2);
		
		
	}
	void InValidLogin1() throws InterruptedException, IOException {
		driver.get(obj.getProperty("URL"));
		XP("XUN").sendKeys(obj.getProperty("VUN"));
		XP("XPW").sendKeys(obj.getProperty("IPW"));
		SS("Invalid credentials 1");
		XP("XLN").click();
		time(2);
		String text= XP("XET").getText();
		System.out.println("While login with valid username and invalid password:");
		
		System.out.println(text);
		SS("Error message 1");

	}
	void InValidLogin2() throws InterruptedException, IOException {
		driver.get(obj.getProperty("URL"));
		XP("XUN").sendKeys(obj.getProperty("IUN"));
		XP("XPW").sendKeys(obj.getProperty("VPW"));
		SS("Invalid credentials 2");
		time(2);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",XP("XLN"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",XP("XLN"));
		String text= XP("XET").getText();
		System.out.println("While login with invalid username and valid password:");
		System.out.println(text);
		SS("Error message 2");

	}
	void InValidLogin3() throws InterruptedException, IOException {
		driver.get(obj.getProperty("URL"));
		XP("XUN").sendKeys(obj.getProperty("IUN"));
		XP("XPW").sendKeys(obj.getProperty("IPW"));
		SS("Invalid credentials 3");
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",XP("XLN"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",XP("XLN"));
		String text= XP("XET").getText();
		System.out.println("While login with invalid username and invalid password:");
		System.out.println(text);
		SS("Error message 3");

	}
}
