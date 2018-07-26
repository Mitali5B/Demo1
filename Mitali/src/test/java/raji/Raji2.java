package raji;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Raji2 {
	
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {
		 
		 System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.timesjobs.com/candidate/register.html");
		 //driver.manage().window().maximize();
		 JavaScriptExecutor j = (JavaScriptExecutor) driver;
		
	 }	 
	 
		 public static void setClipboardData(String string)
		 {
			 StringSelection stringSelection = new StringSelection(string);
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		 }
		 
	  
	
  @Test
  public void f() throws InterruptedException, AWTException {
	  
	  
	 
	  Actions a = new Actions(driver);
	  WebElement email = driver.findElement(By.id("emailAdd"));
	  a.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("newuser").build().perform();
	  WebElement password = driver.findElement(By.id("passwordField"));
	  a.doubleClick(password).build().perform();
	 
	 driver.findElement(By.id("resumeFile_basic")).click();
	 Thread.sleep(2000);
	 //sendKeys("C:\\Users\\PDC4-Training.PDC4\\Desktop\\21.docx");\
	 
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  setClipboardData("C:\\Users\\PDC4-Training.PDC4\\Desktop\\21.docx");
		 
		  r.keyPress(KeyEvent.VK_CONTROL);
		  //
		  r.keyPress(KeyEvent.VK_V);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_V);
		  
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		  //driver.quit();
	  }
	 
  
 

  @AfterTest
  public void afterTest() {
  }

}
