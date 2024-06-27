package Threads;

public class JThread1 extends Thread
{
	static Thread mainthread;
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			
			System.out.println("Child Thread :"+i);
			try
			{
				mainthread.join();
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args)  throws InterruptedException
	{
		mainthread =Thread.currentThread();	
		JThread1 j1=new JThread1();
		j1.start();
		//j1.join();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main THread :"+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
		}
	}	
	

}
