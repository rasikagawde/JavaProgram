/******************************************************************************
 *  Purpose: Print 3 names.
 *
 *  @author  rasika
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.basicjavaprogram;


import com.bridgelabz.util.utility;

public class PrintThreeNames 
{
	public static void main(String []args)
	{
		System.out.println("Name in reverse order:");
		System.out.println("Hi" + utility.reverseName(args));
		
		
	}
}