package Threads;

public class JThread extends Thread
{
	public void rum()
	{
	
	try 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("child Thread"+i);
			Thread.sleep(1000);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public static void main(String args []) throws InterruptedException
	{
		JThread j=new JThread();
		j.start();
		j.join();
		
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Main Thread"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
