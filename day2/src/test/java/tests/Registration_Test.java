package tests;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Registration;
import utility.Excelutility;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Registration_Test {
	WebDriver d;
	Homepage h;
	Registration r;
	Excelutility e;
  @Test
  public void f() throws IOException {
	  
	 h.clickRegistration();
	 //r.regis();
	//e.getTestdata();
	 e.getTestdata();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	  
	 d = new ChromeDriver();
	 d.get("http://demowebshop.tricentis.com/");
	 d.manage().window().maximize();
	 
	// h = new Homepage();
	 h = PageFactory.initElements(d, Homepage.class);
	 r=PageFactory.initElements(d, Registration.class);
	 e=new Excelutility();
  }

  @AfterTest
  public void afterTest() {
  }

}
