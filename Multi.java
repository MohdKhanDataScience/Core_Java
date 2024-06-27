package Threads;

public class Multi implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Running");
		System.out.println("starting Runnable");
	}
	public static void main(String [] args)
	{
		Multi m=new Multi();
		Thread t=new Thread(m);
		t.start();
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(t.isAlive());

	}
}
 