/*
 *  Purpose: To determine the speed of wind.
 *
 *  @author  Rasika
 *  @version 1.0
 *  @since   09-08-2019
 */


package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class WindChill 
{
	public static void main(String[]args)
	{
		double t= Double.parseDouble(args[0]);
		double v= Double.parseDouble(args[1]);
		System.out.println("Enter temperature: ");
		System.out.println("Enter speed: ");
		utility.wind(t,v);
	}
}
