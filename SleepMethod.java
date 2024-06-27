package Threads;

public class SleepMethod extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Thread");
		
		SleepMethod t1=new SleepMethod();
		t1.start();
		
		SleepMethod t2=new SleepMethod();
		t2.start();
		

	}

}
