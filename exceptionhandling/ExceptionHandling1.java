package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling1 {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ENTER THE VALUE1:");
		int val1=sc.nextInt();
		
		System.out.print("ENTER THE VALUE2:");
		int val2=sc.nextInt();
		
		try
		{
			System.out.println(val1/val2);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
