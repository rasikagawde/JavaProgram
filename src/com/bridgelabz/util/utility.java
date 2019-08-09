/******************************************************************************
 * Purpose: The utility file which uses logic of programs.
 *
 *  @author  Rasika
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.util;

import java.util.Scanner;

public class utility 
{
	public static String reverseName(String[] args)
	{
	
		int i;
		int length = args.length;
		String reverse=" ";
		for(i=length-1;i>=0;i--)
		{
			if(i==0)
			{
				reverse=reverse+args[i]+".";
			}
			else
			{
				reverse=reverse+args[i]+","+" ";
			}
			}
		return reverse;
		}

public static void operation(int a, int b, int c)
	{
		System.out.println("Value of a+b*c="+(a+b*c) );
		System.out.println("Value of a*b+c="+(a*b+c) );
		System.out.println("Value of c=a/b="+(c+a/b) );
		System.out.println("Value of a%b+c="+(a%b+c) );
	}



	public static void answer(double a, double b, double c)
	{
		System.out.println("Value of a+b*c="+(a+b*c) );
		System.out.println("Value of a*b+c="+(a*b+c) );
		System.out.println("Value of c=a/b="+(c+a/b) );
		System.out.println("Value of a%b+c="+(a%b+c) );
	}

	public static String printlnTheThreeNames(int length, String[] args1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String utilString() {
		// TODO Auto-generated method stub
		return null;
	}	


	public static void year(int year)
	{
		if(year%4==0 && year%100!=0 && year==400)
			System.out.println("This is leap year");
		else
			System.out.println("This is not a leap year");
	}
	
	
	public static void dayofmonth(int m,int d)
	{
		if((m>=3 && d>=20) && (m<=6 && d<=20))
			System.out.println("True");
		else
			System.out.println("False");
		
	}

	public static void root(int a, int b, int c) 
	{
		int delta= b*b - 4*a*c;
		int sqroot= (int) Math.sqrt(delta);
		int root1= -b+(sqroot)/2*a;
		int root2= -b-(sqroot)/2*a;
		
		System.out.println("root1="+root1);
		System.out.println("root2="+root2);
		
	}

	public static void sum(int dice1, int dice2) 
	{
		System.out.println("sum of two dice: "+ (dice1+dice2));
	}



	public static void value() 
	{
		float sum=0;
	    for(int i = 1;i<=5;i++)
	    {
	    	float randomNum=(float)(Math.random());
	    	System.out.println("Random no. is: "+randomNum);
	    	sum=sum+randomNum;
	    }
		System.out.println("Average value= "+sum/5);
		System.out.println("Minimum value= "+Math.min(0.0,1.0));
		System.out.println("Maximum value= "+Math.max(0.0,0.1));
	}

	public static void axis(double x, double y) 
	{
		double sqr=(x*x)+(y*y);
		double distance= Math.sqrt(sqr);
		System.out.println("Euclidian Distance= "+distance);
	}

	public static void wind(double t, double v) 
	{
		double w= 35.74+(0.6215*t)+((0.4275*t)-35.75)*((Math.pow(v,0.16)));
		System.out.println("speed of wind: "+w);
	}
}

