package bai1_thread;

public class ImplRunable implements Runnable {
	
	private Thread t;
	private String name;
	
	public ImplRunable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i = 4;i>=0 ;i--) {
			System.out.println(this.name + " running..." + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(this.name + "exit");
		
	}
	public void join() {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void start() {
		if(t == null) {
			t = new Thread(this,this.name);
			t.start();
		}
	}
}
