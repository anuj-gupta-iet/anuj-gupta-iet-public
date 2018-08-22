package intermediate;


public class HowThreadJoinWorkInternally {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " started");
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " completed");
			}
		}, "Thread1");
		t1.start();
		t1.join();
		System.out.println(Thread.currentThread().getName() + " completed");

	}
}
