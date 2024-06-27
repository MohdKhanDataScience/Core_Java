package com.in28minutes.exception;

public class CheckedExceptionRunner {

	public static void main(String[] args) 
	{
		try {
		Thread.sleep(2000);
		System.out.println("Main Method");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		someOtherMethod2();
		//someOtherMethod();
	}

	private static void someOtherMethod() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	private static void someOtherMethod2() throws RuntimeException
	{
		System.out.println("Runtime Exception method is calling..");
	}
	

}
