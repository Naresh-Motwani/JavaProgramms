package multithreading;

class Count {
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class P05_MyThread_Synchronized {

	public static void main(String[] args) throws Exception {

		Count count = new Count();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					count.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					count.increment();
				}
			}
		});
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Count value is " + count.count);

	}

}
