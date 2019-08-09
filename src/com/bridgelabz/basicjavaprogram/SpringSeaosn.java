/**********************
 *  Purpose: To print day of month.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;


import com.bridgelabz.util.utility;
public class SpringSeaosn 
{
	public static void main(String[]args)
	{
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		
		System.out.println("Enter day of month:");
		utility.dayofmonth(m, d );
	}
}
