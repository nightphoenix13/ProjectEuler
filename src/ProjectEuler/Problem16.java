// Written by Zack Rosales
// Project Euler Problem # 16
// 2^15 = 32768 and the sum of it's digits is 3 + 2 + 7 + 6 + 8 = 26
// What is the sum of the digits of the number 2^1000?

package ProjectEuler;

import java.math.BigInteger;

public class Problem16
{ // class start
	public static void main(String[] args) // main method start
	{
		BigInteger two = new BigInteger("2");
		BigInteger subtotal = two.pow(1000);
		int total = 0;
		String finalOutput = "";
		
		System.out.println("2 to the 1000th is " + subtotal);
		
		String strSubTotal = String.format("%d", subtotal);
		
		for (int x = 0; x < strSubTotal.length(); x++)
		{
			char c = strSubTotal.charAt(x);
			finalOutput += String.format("%s", c);
			total += Character.getNumericValue(c);
			if (x + 1 < strSubTotal.length())
			{
				finalOutput += " + ";
			} // end if
			else
			{
				finalOutput += " = ";
			} // end else
		} // end for
		
		finalOutput += String.format("%d", total);
		System.out.println(finalOutput);
	} // main method end
} // class end
