package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	
	WebDriver d;
	@FindBy(id="gender-female")
	static
	WebElement gender ;
	@FindBy(id="FirstName")
	static
	WebElement name ;
	@FindBy(id="LastName")
	static
	WebElement lastname;
	@FindBy(id="Email")
	static
	WebElement mail;
	@FindBy(id="Password")
	static
	WebElement paswrd;
	@FindBy(id="ConfirmPassword")
	static
	WebElement conpaswrd;
	@FindBy(id="register-button")
	static
	
	
	WebElement regbutton;
	
	public static void regis(String F, String L, String E, String P, String CP)
	{
		gender.click();
		name.sendKeys(F);
		lastname.sendKeys(L);
		mail.sendKeys(E);
		paswrd.sendKeys(P);
		conpaswrd.sendKeys(CP);
		regbutton.click();
	}
	

public void Registration(WebDriver driver)
	
	{
		this.d=driver;
		
	}
}
