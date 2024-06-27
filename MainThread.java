package Threads;

public class MainThread {

	public static void main(String[] args) //Main Thread
	{
		// TODO Auto-generated method stub
		
		MyThread1 m1=new MyThread1();//creating an Thread1
		m1.start();
	
		MyThread2 m2=new MyThread2();//Creating an Thread2
		m2.start();
		Thread.currentThread().setName("khan");
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(10/0);
	}

}
class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Task1..");
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		
		System.out.println("Task2..");
	}
	
	
}