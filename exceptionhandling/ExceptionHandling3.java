package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		try {
		System.out.print("ENTER THE PHONE NUMBER:");
		long phoneno=sc.nextLong();
		
		System.out.println(phoneno);
		}
		catch(InputMismatchException e)
		{
		   System.out.println("<<INPUT MISMATCH EXCEPTION>> PHONE NUMBERS IS ONLY THE NUMBERS");	
		}
		
		
		
	}

}
