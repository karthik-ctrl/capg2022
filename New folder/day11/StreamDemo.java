package account1.datetime;

import java.util.stream.Stream;
public class StreamDemo {
	public static void  main(String ar[]) {
		//functional style programming
	Stream.iterate(1,element ->element+1).filter(element ->element % 5==0).limit(3).forEach(System.out::println);
		
	}

}
