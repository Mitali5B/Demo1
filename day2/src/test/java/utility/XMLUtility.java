package utility;


import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class XMLUtility {
	public void readXML() throws JAXBException
	{
		File f = new File("C:\\Users\\PDC4-Training.PDC4\\eclipse-workspace\\day2\\TestData.xml");
		JAXBContext j = JAXBContext.newInstance(RegData.class);
		Unmarshaller u = j.createUnmarshaller();
		u.unmarshal(f);
		
		RegData r = (RegData)u.unmarshal(f);
		List<Data> mydata = r.getUserdata();
		for(Data d :mydata)
		{
			System.out.println("Firstname: "+d.getFirstname());
			System.out.println("lastname: "+d.getlastname());
		}
		
	}
	
	public static void main(String args[]) throws JAXBException
	{
		XMLUtility x= new XMLUtility();
		x.readXML();
	}

}
