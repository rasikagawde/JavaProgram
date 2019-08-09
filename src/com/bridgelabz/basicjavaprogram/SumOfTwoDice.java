/***
 *  Purpose: Sum of two rolling dice.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class SumOfTwoDice 
{
	public static void main(String[]args)
	{
		int sides = 6;
		int dice1 = 1 + (int) (Math.random() *sides);
	    int dice2 = 1 + (int) (Math.random() *sides);
	    System.out.println(dice1+" "+dice2);
	    System.out.println("sum of two dice: ");
		utility.sum(dice1,dice2);
	}
}
