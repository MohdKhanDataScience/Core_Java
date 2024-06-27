package com.in28minutes.exception;

import java.util.Scanner;

public class finallyRunner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		
		try {
		
		int [] num= {1,2,3,4};
		int n=num[4];
		System.out.println(n);
		
		System.out.println("Before sc closed");
		
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		finally {
			
			
			sc.close();
		System.out.println("Main enden");
		}
	}

}
