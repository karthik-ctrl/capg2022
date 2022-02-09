package account1.hashmap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

// Write a program that will have a Properties class which is capable of storing some
//States of India and their Capital. Use an Iterator to list all the elements of the Properties.

public class Hashass3 {

	public static void main(String[] args) {

		Properties p1=new Properties();
		p1.setProperty("telangana", "huderabad");
		p1.setProperty("andhraprades", "amaravathi");

		p1.setProperty("westbengal", "kolkatha");
		Set<Entry<Object, Object>> set = p1.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<Object, Object> me = it.next();
			System.out.println(me);
		}


	}

}
