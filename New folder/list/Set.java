package account1;

import java.util.HashSet;
import java.util.Iterator;

 class Country {
	HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> saveCountryNames(String CountryName) {
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

public class Set {

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
