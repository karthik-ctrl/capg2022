package account1;
//1. Create class of SalesPersons as a thread that will display    fives sales persons name.
//2. Create a class as Days as other Thread that has array of seven days.
//3. Call the instance of SalesPersons in Days and start both the 
 // threads
////4. suspend SalesPersons on Sunday and resume on wednesday 
//Note: use suspend, resume methods from thread
class SalesPersons extends Thread
{ private String name[]= {"karthik ","tharun ","nagesh ","abhi ","sai "};
	public void run()
	{
		
		for (String k:name)
		{
			System.out.print(k);
		}
	}
}
class Days extends Thread
{ private String days[]= {"sunday ","monday ","tuesday ","wednesday ","thursday ","friday ","saturday "};
	public void run()
	{
		SalesPersons salesPersons = new SalesPersons();
		salesPersons.start();
		for (String d : days) {
			System.out.print(d);}
		if(days.equals("sunday"))
		{
			System.out.println("suspending sales person");
			salesPersons.suspend();
		}
		if(days.equals("wednesday"))
		{
			System.out.println("resuming");
			salesPersons.resume();
		}
	}
}

public class Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Days d=new Days();
Thread t1=new Thread(d);
t1.start();
	}

}
