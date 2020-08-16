package threadsTest;

class PrintDemo2{
	public void printCount() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Counter     ----    " + i);
			}
		}catch (Exception e) {
			System.out.println("Thread interrupted.");
		}
	}
}

class ThreadsTest2 extends Thread{
	private Thread t;
	private String threadName;
	PrintDemo2 PD;
	
	public ThreadsTest2(String name, PrintDemo2 pd) {
		threadName = name;
		PD = pd;
	}
	
	public void run() {
		synchronized (PD) {
			PD.printCount();
		}
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	public void start() {
		System.out.println("Starting " +threadName);
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

class TestThread2{
	public static void main(String args[]) {
		PrintDemo2 PD = new PrintDemo2();
		
		ThreadsTest2 T1 = new ThreadsTest2("Thread - 1.2", PD);
		ThreadsTest2 T2 = new ThreadsTest2("Thread - 1.2", PD);
		
		T1.start();
		T2.start();
		
		// wait for threads to end
		try {
			T1.join();
			T2.join();
		}catch(Exception e) {
			System.out.println("Interrupted");
		}
	}
}
