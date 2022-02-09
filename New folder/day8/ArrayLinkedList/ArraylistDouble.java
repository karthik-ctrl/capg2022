package account1;

import java.util.ArrayList;

public class ArraylistDouble {
	class MyArrayList<E> extends ArrayList<E> {
		@Override
		public boolean add(E e) {
			if (e instanceof Integer || e instanceof Float || e instanceof Double) {
				super.add(e);
				return true;
			} else {
				throw new ClassCastException("Only Integer, Float, and Double are supported.");
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> a1=new ArrayList<>();
a1.add(10);
a1.add(10.0);
a1.add(100000.000);
System.out.println(a1);


	}

}
