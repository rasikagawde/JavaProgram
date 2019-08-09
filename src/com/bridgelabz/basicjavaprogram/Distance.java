/**
 *  Purpose: To determine the Euclidian Distance.
 *
 *  @author  Rasika
 *  @version 1.0
 *  @since   09-08-2019
 *  **/

package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class Distance 
{
	public static void main(String[]args)
	{
		System.out.println("Enter X axis:");
		System.out.println("Enter Y axis:");
		 double x= Double.parseDouble(args[0]);
		 double y= Double.parseDouble(args[1]);
		utility.axis(x,y);
	}
}
