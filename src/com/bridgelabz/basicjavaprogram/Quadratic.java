/***
 *  Purpose: Quadratic equation to find root value.
 *
 *  @author  Rasika
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;

import com.bridgelabz.util.utility;
public class Quadratic {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter  int a: ");
		a= scanner.nextInt();
		System.out.println("Enter int b: ");
		b= scanner.nextInt();
		System.out.println("Enter int c: ");
		c= scanner.nextInt();
		utility.root(a,b,c);
		scanner.close();
	}

}
