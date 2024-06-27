package Threads;

public class YieldThread 
{

	public static void main(String[] args) 
	{
		Zest t=new Zest();
		
		t.start();
		Thread.yield();
		 
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ i);
		}

	}

}
class Zest extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ i);
		}
	}
}