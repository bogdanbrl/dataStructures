package threadsTest;


// acesta este un exemplu de accesare a aceeasi resurse
// un contra examplu al thread ului


class PrintDemo3{
	public void printCount() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Counter      ----     " + i);
			}
		}catch (Exception e){
			System.out.println("Thread interrupted.");
		}
	}
}

class ThreadsTest3 {
	
	private String threadName;
	PrintDemo PD;
	
	ThreadsTest3(String name, PrintDemo pd){
		threadName = name;
		PD = pd;
	}
	
	public void run() {
		PD.printCount();
		System.out.println("Thread " + threadName + " existing.");
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		run();
	}
}

class TestThread3{
	public static void main(String args[]) {
		PrintDemo PD = new PrintDemo();
		
		ThreadsTest3 T1 = new ThreadsTest3("Thread - 1.3", PD);
		ThreadsTest3 T2 = new ThreadsTest3("Thread - 2.3", PD);
		
		T1.start();
		T2.start();
		
	
	
	}
}
