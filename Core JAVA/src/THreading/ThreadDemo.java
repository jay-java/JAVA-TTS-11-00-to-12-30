package THreading;

//Thread -> is smallest unit of process.
//Two ways to achieve thread->1.By Thread class 2. By Runnable interface
//Runnable interface is better way to achieve thread 
//class NewThread implements Runnable{
//	Thread t;
//	public NewThread() {
//		t = new Thread(this,"Child Thread");
//		t.start();
//	}
//	public void run() {
//		try {
//			for(int i=1;i<=5;i++) {
//				System.out.println(t+" : "+i);
//				Thread.sleep(2000);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("child thread completed");
//	}
//}
class NewThread extends Thread{
	Thread t;
	public NewThread() {
		t = new Thread(this, "Child Thread");
		t.start(); // to execute thread start method should be called
	}

	public void run() { // predefine method which called when threat starts
		
			for (int i = 1; i <= 5; i++) {
				System.out.println(t + " : " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		System.out.println("child thread completed");
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		new NewThread();
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(t + " : " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main thread completed");
	}
}