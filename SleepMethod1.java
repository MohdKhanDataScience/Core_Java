package Threads;

public class SleepMethod1 extends Thread
{
	public void run()
	{
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
		System.out.println("Main Thread");
		SleepMethod1 s1=new SleepMethod1();
		s1.start();
		
		SleepMethod1 s2=new SleepMethod1();
		s2.start();
		

	}

}
