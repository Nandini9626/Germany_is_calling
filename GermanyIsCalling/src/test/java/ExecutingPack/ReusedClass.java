package ExecutingPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ReusedClass extends ExecutingClass {
	
	WebElement XP(String a) {
		return driver.findElement(By.xpath(obj.getProperty(a)));
		
	}
	public void time(int a) throws InterruptedException {
		int b= a*1000;
		Thread.sleep(b);
	}
	public void SS(String a) throws IOException {
		File S= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File D= new File("C:\\Users\\vijay\\eclipse-workspace\\GermanyIsCalling\\Screenshots\\"+a+".jpg");
		FileHandler.copy(S, D);
	}
}
