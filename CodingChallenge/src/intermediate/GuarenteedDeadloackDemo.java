package intermediate;

import java.util.concurrent.CountDownLatch;

class SharedResource {
	CountDownLatch latch = new CountDownLatch(2);

	void m1() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " waiting to acquire String.class lock");
		synchronized (String.class) {
			latch.countDown();
			latch.await();
			System.out.println(Thread.currentThread().getName() + " acquired String.class lock");
			System.out.println(Thread.currentThread().getName() + " waiting to acquire Integer.class lock");
			synchronized (Integer.class) {
				System.out.println(Thread.currentThread().getName() + " acquired Integer.class lock");
			}
			System.out.println(Thread.currentThread().getName() + " released Integer.class lock");
		}
		System.out.println(Thread.currentThread().getName() + " released String.class lock");
	}

	void m2() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " waiting to acquire Integer.class lock");
		synchronized (Integer.class) {
			latch.countDown();
			latch.await();
			System.out.println(Thread.currentThread().getName() + " acquired Integer.class lock");
			System.out.println(Thread.currentThread().getName() + " waiting to acquire String.class lock");
			synchronized (String.class) {
				System.out.println(Thread.currentThread().getName() + " acquired String.class lock");
			}
			System.out.println(Thread.currentThread().getName() + " released String.class lock");
		}
		System.out.println(Thread.currentThread().getName() + " released Integer.class lock");
	}
}

public class GuarenteedDeadloackDemo {
	public static void main(String[] args) throws InterruptedException {
		SharedResource ob = new SharedResource();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					ob.m1();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					ob.m2();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		Thread.sleep(2000);
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Done");
	}
}
