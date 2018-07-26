package utility;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;
@XmlRootElement (name="Data")

public class Data {
	private String Firstname;
	private String Lastname;
	
	@XmlElement
	public void setFirstname(String f) {
		
		this.Firstname=f;
		
	}
	
	public String getFirstname()
	{
		return Firstname;
	}
	
	@XmlElement
	public void setLastname(String f) {
		
		this.Lastname=f;
		
	}
	
	public String getlastname()
	{
		return Lastname;
	}
	
	
	
}
