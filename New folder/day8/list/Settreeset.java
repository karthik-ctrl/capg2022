package account1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

//Develop a java class with a instance variable Country HashSet (H1)
//add a method saveCountryNames(String CountryName) , 
//the method should add the passed country to a HashSet (H1) and 
//return the added HashSet(H1). Develop a method getCountry(String CountryName) which
//iterates through the HashSet and returns the country if exist else return null. NOTE:
//You can test the methods using a main method

 class Country {
	TreeSet<String> H1 = new TreeSet<>();
	
	public TreeSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
}

public class Settreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c=new Country();
		c.saveCountryNames("india");
		c.saveCountryNames("america");
		c.saveCountryNames("china");
		c.saveCountryNames("africa");
		c.saveCountryNames("germany");
		System.out.println("india:"+ c.getCountry("india"));
		

	}

}
