package account1;
//Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds before printing 6


public class ASS21 implements Runnable {
	static Thread t1;
	
	public static void main(String[] args) {
		t1 = new Thread(new ASS21());
		t1.start();

	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				try {
					t1.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(i);
		}		
	}

}
