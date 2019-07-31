package bai1_thread;

public class MainBai1 {

	public static void main(String[] args) {
		
		ImplRunable Thread1 = new ImplRunable("Thread1");
		
		ImplRunable Thread2 = new ImplRunable("Thread2");
		ImplRunable Thread3 = new ImplRunable("Thread3");
		
		
		Thread1.start();
		Thread1.join(); // Wait for Thread1 done , continue..
		
		Thread2.start();
		Thread3.start();
		
		
		for(int i = 4;i>=0;i--) {
			System.out.println("ThreadMain running.." + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ThreadMain exit");
	}

}
