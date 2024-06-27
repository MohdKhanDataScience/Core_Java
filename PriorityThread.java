package Threads;

public class PriorityThread extends Thread
{

	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());//5 by default..
	
		System.out.println("run..");
	}
	public static void main(String[] args)
	{
		System.out.println("main Thread..");
		//Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getPriority());//5 by default..
		PriorityThread pt=new PriorityThread();
		pt.setPriority(MAX_PRIORITY);
		pt.start();

	}

}
