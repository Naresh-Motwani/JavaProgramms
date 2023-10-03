package multithreading;

public class P04_MyThread_Join_IsAlive {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		Thread.sleep(500);
		t2.start();

		t1.join();
		t2.join();

		if (t1.isAlive() && t2.isAlive()) {
			System.out.println(" Yes Its Alive");
		} else {
			System.out.println(" Its dead");
		}
		System.out.println("Done ");
	}
}
