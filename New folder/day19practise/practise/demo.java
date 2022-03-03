package practise;

import java.util.ArrayList;
import java.util.stream.Stream;

class Product{
	 
		 private int id;
		 String name;
		 int price;
		 
	 
	 public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	 
	 
 }

public class demo {
	
	public static void  main(String ar[]) {
		
		ArrayList<Product> arraylist = new ArrayList<Product>();
		
		arraylist.add(new Product(1,"samsung",2000));
		arraylist.add(new Product(2,"mi",3000));
		arraylist.add(new Product(3,"google",7000));
		arraylist.add(new Product(4,"iphone",8000));
		arraylist.stream().filter(prod->prod.price>3000).map(prod->prod.price).forEach(System.out::println);
		Stream.iterate(1,element ->element+1).filter(element ->element % 5==0).limit(10).forEach(System.out::println);
		
		
		
	}

}