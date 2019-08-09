/******************************************************************************  
 *  Purpose: Operation of Double integer values.
 *
 *  @author  Rasika
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/



package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;

import com.bridgelabz.util.utility;

public class DoubleOpt 
{
	public static void main(String []args)
	{
		double a,b,c;
		Scanner scanner=new Scanner(System.in);
			System.out.println("Enter A:");
			a=scanner.nextDouble();
			System.out.println("Enter B:");
			b=scanner.nextDouble();
			System.out.println("Enter C:");
			c=scanner.nextDouble();
			utility.answer(a,b,c);
			scanner.close();
	}
}
