package account1;
//Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.

//Setting the name of the thread. 	



public class ASS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread("Scooby") {
		public void run()
		{
			System.out.println(Thread.currentThread().getName());
		}
		};
		Thread t2=new Thread("Shaggy") {
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
			}
		};
		t1.start();
		t2.start();

	}

}
