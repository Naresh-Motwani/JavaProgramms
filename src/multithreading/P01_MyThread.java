package multithreading;

class A extends Thread {

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

class B extends Thread {

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

public class P01_MyThread {

	public static void main(String[] args) throws InterruptedException {

		A a = new A();
		B b = new B();

		a.start();
		Thread.sleep(500);
		b.start();

	}
}
