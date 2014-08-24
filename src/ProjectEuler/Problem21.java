// Written by Zack Rosales
// Project Euler Problem # 21
// Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly
// into n). If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a
// and b are called amicable numbers. 
// For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore
// d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
// Evaluate the sum of all the amicable numbers under 10000.

package ProjectEuler;

import java.util.*;

public class Problem21
{ // class start
	public static void main(String[] args) // main method start
	{
		ArrayList<Integer> amicableNumbers = new ArrayList<>();
		int numberToCheck = 2;
		int result;
		int sum = 0;
		
		while (numberToCheck <= 10000)
		{
			result = getSumOfDivisors(numberToCheck);
			if (getSumOfDivisors(result) == numberToCheck && result != numberToCheck)
			{
				System.out.println("Amicable Number: " + numberToCheck + " - " + result);
				amicableNumbers.add(numberToCheck);
			} // end if
			numberToCheck++;
		} // end while
		
		for (int x = 0; x < amicableNumbers.size(); x++)
		{
			sum += amicableNumbers.get(x);
		} // end for
		
		System.out.println("Sum of amicable numbers: " + sum);
	} // main method end
	
	private static int getSumOfDivisors(int number) // getSumOfDivisors method start
	{
		ArrayList<Integer> divisors = new ArrayList<>();
		int sum = 0;
		
		for (int x = 1; x < number; x++)
		{
			if (number % x == 0)
			{
				divisors.add(x);
			} // end if
		} // end for
		
		for (int x = 0; x < divisors.size(); x++)
		{
			sum += divisors.get(x);
		} // end for
		
		return sum;
	} // getSumOfDivisors method end
} // class end
