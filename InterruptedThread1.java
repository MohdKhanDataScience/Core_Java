package Threads;

public class InterruptedThread1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		InterruptedThread1 it1=new InterruptedThread1 ();
		it1.start();
		 it1.interrupt();

	}

}
