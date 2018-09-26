package collegeJava;

//Program for counter using two THREADS and SYNCHRONIZATION:
class Temp {
	int c;

	public synchronized void increment() {
		{
			c++;
		}
	}
}

class Selfcount {
	public static void main(String[] args) throws Exception {
		Temp tp = new Temp();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++)
					tp.increment();
			}
		});
		t1.start();
		t1.join();
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 2000; i++)
					tp.increment();
			}
		});
		t2.start();
		t2.join();
		System.out.println("count=" + tp.c);
	}
}
