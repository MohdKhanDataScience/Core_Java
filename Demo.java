package Threads;

public class Demo extends Thread {
	public void run() {
		System.out.println("running");
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.start();
		
		// Multiple Threads using single class..-
		Demo d1=new Demo();
		d1.start();
	}

}
