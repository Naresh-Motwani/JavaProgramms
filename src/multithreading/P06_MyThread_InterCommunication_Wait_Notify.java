package multithreading;

class Q {
	int num;
	boolean valueSet = false;

	public synchronized void put(int num) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Put : " + num);
		this.num = num;
		valueSet = true;
		notify();
	}

	public synchronized void get() {

		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get : " + num);
		valueSet = false;
		notify();
	}
}

class Producer implements Runnable {

	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t1 = new Thread(this, "Producer");
		t1.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {

			q.put(i++);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Consumer implements Runnable {

	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t2 = new Thread(this, "Consumer");
		t2.start();
	}

	@Override
	public void run() {
		while (true) {
			q.get();

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class P06_MyThread_InterCommunication_Wait_Notify {

	public static void main(String[] args) {

		Q q = new Q();
		new Producer(q); // Ananomus obj
		new Consumer(q); // Ananomus obj

	}

}
