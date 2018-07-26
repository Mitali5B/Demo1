package raji;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class screenshot {
	static WebDriver driver;
	static int counter=1;
  @Test
  public void f() throws IOException {
	  takescreenshot();
	  takescreenshot();
	  takescreenshot();
	  
	  
  }
  @BeforeTest
  
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.timesjobs.com/candidate/register.html");
		 //driver.manage().window().maximize();
  }
  
  public static void takescreenshot() throws IOException {
	  TakesScreenshot t = (TakesScreenshot)driver;
	  File f=t.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,  new File("C:\\Users\\PDC4-Training.PDC4\\Desktop\\screenshot\\file"+counter+".jpg"));
	  counter=counter+1;
  }

  @AfterTest
  public void afterTest() {
  }

}
