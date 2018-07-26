package raji;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;



@Test
public class raji5 {
	
	
	
  public void javascript()throws AWTException, InterruptedException  {
	  WebDriver driver;
	  Thread.sleep(3000);
	  
	  JavascriptExecutor j = (JavascriptExecutor) driver;
		 j.executeScript("Window.scroll(0,800)");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	 
	  System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.timesjobs.com/candidate/register.html");
		 //driver.manage().window().maximize();
		  Thread.sleep(3000);

  }
 
  @AfterTest
  public void afterTest() {
  }

}
