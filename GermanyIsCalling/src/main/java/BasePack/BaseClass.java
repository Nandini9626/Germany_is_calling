package BasePack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	
  public static WebDriver driver;
  public static Properties obj;
  
  
    
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  System.setProperty("WebDriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\GermanyIsCalling\\ChromeDriver\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  FileInputStream f=new FileInputStream("C:\\Users\\vijay\\eclipse-workspace\\GermanyIsCalling\\src\\data\\java\\FlatData\\FlatFile") ;
      obj=new Properties();
      obj.load(f);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
