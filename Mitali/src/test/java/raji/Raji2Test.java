package raji;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Raji2Test {
	WebDriver driver;
  
 

  @Test
  public void javascript()throws AWTException {
	  
		 driver.get("https://www.timesjobs.com/candidate/register.html");
		 //driver.manage().window().maximize();
		 JavascriptExecutor j = (JavascriptExecutor) driver;
		 j.executeScript("Window.scroll(0,800)");
  
  }
  
  @BeforeTest
  System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
	 
	 driver = new ChromeDriver();
	 driver.get                                        
	 
}
