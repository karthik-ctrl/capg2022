package account1;
//Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
//Note: Display all even numbers followed by odd numbers
//Hint: use join


public class Ass22 implements Runnable {
	static Thread odd;
	static Thread even;

	public static void main(String[] args) {
		Ass22 obj = new Ass22();
		
		odd = new Thread(obj, "Odd");
		even = new Thread(obj, "Even");
		
		odd.start();
		even.start();
	}

	@Override
	public void run() {
		try {
			if (Thread.currentThread().getName().equals("Odd")) 
				even.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 1; i <= 20; i++) {
			if (Thread.currentThread().getName().equals("Even")) {
				if (i % 2 == 0) System.out.print(i);
			} 
			
			if (Thread.currentThread().getName().equals("Odd")) {
				if (i % 2 == 1) System.out.print(i);
			}
		}
	}

}