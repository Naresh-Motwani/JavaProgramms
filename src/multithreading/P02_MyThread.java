package multithreading;

class Hi implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hi " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

class Hello implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class P02_MyThread {

	public static void main(String[] args) {

		Hi hi = new Hi();
		Hello hello = new Hello();

		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);

		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}