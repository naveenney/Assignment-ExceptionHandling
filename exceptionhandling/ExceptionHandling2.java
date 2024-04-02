package exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling2 {
	
	
	public static void checkDublicate(List<Integer> list) throws DublicateValueException
	{
		List <Integer> list1=new ArrayList<>();
		
		for(int i=0;i<list.size();i++)
		{
			if(list1.contains(list.get(i)))
			{
			    throw new DublicateValueException("DUBLICATE VALUE FOUND");	
				
			}
			list1.add(list.get(i));
		}
		
	}
	
	public static void main(String[] args)
	{
		
		List <Integer> list=new ArrayList<>();
		
		list.add(10);
		
		list.add(12);
		
		list.add(10);
		
		try {
			checkDublicate(list);
		} catch (DublicateValueException e) {
			System.out.println(e.getMessage());
		}
	}
       
}
