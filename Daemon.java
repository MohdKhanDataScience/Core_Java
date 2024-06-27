package Threads;

public class Daemon extends Thread 
{
	public void run()
	{
		//System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Child Thread");
	}

	public static void main(String[] args)
	{
		System.out.println("Main Thrad..");
		Daemon d=new Daemon();
		d.setDaemon(true);
		d.start();

	} 

}
