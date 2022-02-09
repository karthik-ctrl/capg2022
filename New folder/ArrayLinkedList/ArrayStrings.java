package account1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<>();
		a1.add("apple");
		a1.add("banana");
		a1.add("cat");
		a1.add("dog");
		 Iterator i1=a1.iterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }

	}

}
