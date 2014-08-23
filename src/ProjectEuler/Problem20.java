// Written by Zack Rosales
// Project Euler Problem # 20
// n! means n × (n - 1) × ... × 3 × 2 × 1
// For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
// and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
// Find the sum of the digits in the number 100!

package ProjectEuler;

import java.math.BigInteger;

public class Problem20
{ // class start
	public static void main(String[] args) // main method start
	{
		BigInteger intN = new BigInteger("1");
		String stringN;
		int sum = 0;
		
		for (int x = 1; x <= 100; x++)
		{
			intN = intN.multiply(BigInteger.valueOf(x));
		} // end for
		
		stringN = intN.toString();
		
		for (int x = 0; x < stringN.length(); x++)
		{
			sum += Character.getNumericValue(stringN.charAt(x));
		} // end for
		
		System.out.println(sum);
	} // main method end
} // class end
