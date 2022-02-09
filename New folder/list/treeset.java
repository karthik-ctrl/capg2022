package account1;
//Create Collection called TreeSet which is capable of storing String objects.
//The Collection should have the following capabilities
//a)Reverse the elements of the Collection b)Iterate the elements of the TreeSet
//c) Checked if a particular element exists or not


import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> h1 =new TreeSet<>();
		h1.add("karthik");
		h1.add("nagesh");
		h1.add("abhi");
		h1.add("tharun");
		String s="tharun";
		Iterator  i1=h1.iterator();
		while(i1.hasNext())
		{
			if(i1.next().equals(s))
			{
				System.out.println("yes");
			}
		}

	}

}
