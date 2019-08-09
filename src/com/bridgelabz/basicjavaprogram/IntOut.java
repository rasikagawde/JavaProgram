/******************************************************************************
 *  Purpose: Arithmatic peration of integers.
 *
 *  @author  Rasika
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

import java.util.*;
public class IntOut 
{
	public static void main (String[] args)
	{
		int x,y,z;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A:");
		x= scanner.nextInt();
		System.out.println("Enter B:");
		y= scanner.nextInt();
		System.out.println("Enter C:");
		z= scanner.nextInt();
		utility.operation(x, y, z);
	}
}
