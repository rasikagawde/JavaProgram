/******************************************************************************
 *  Purpose: To determine the Leap Year.
 *
 *  @author  Rasika
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;

import com.bridgelabz.util.utility;

public class LeapYear 
{
	public static void main( String[]args)
	{
	int year;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Year: ");
	year = scanner.nextInt();
	utility.year(year);
	}
}
