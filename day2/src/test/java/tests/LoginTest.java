package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class LoginTest {
  @Test
  public void LoginValid() {
	  String ER= "Tested";
	  String AR = "Tested";
	  
	 Assert.assertEquals(AR,ER);
	 
	  
  }
  

  @Test
  public void LoginInValid() {
	  String ER= "Tested";
	  String AR = "Tested";
	  
	 Assert.assertEquals(AR,ER);
	 
	  
  }

}
