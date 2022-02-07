package account1;

import java.util.Random;

// store colours in the form of an array
//ex: String colours[]={"white","blue","black","green","red","yellow"};
//display all colours repeatedly by generating colour index from Random class. If the random colour index matches to red stop display.
//Note: perform this task by implementing Runnabe interface
class colors implements Runnable
{
	public void run()
	{
		Random r=new Random();
		String color[]={"white","blue","black","green","red","yellow"};
		int i;
		while((i=r.nextInt(6))!=4)
		{
			System.out.println(color[i]);
		}
	}
}
public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable t1 =new colors();
		Thread b1=new Thread(t1);
		b1.start();
		

	}

}
