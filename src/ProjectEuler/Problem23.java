// Written by Zack Rosales
// Project Euler Problem # 23
// A perfect number is a number for which the sum of its proper divisors is exactly equal to the 
// number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which
// means that 28 is a perfect number.
// A number n is called deficient if the sum of its proper divisors is less than n and it is called
// abundant if this sum exceeds n.
// As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be 
// written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that 
// all integers greater than 28123 can be written as the sum of two abundant numbers. However, this
// upper limit cannot be reduced any further by analysis even though it is known that the greatest 
// number that cannot be expressed as the sum of two abundant numbers is less than this limit.
// Find the sum of all the positive integers which cannot be written as the sum of two abundant
// numbers.

package ProjectEuler;

import java.util.*;

public class Problem23
{ // class start
	public static void main(String[] args) // main method start
	{
		ArrayList<Integer> abundents = new ArrayList<>();
		final int LIMIT = 28123;
		int numberToCheck = 2;
		long sum = 0;
		
		while (numberToCheck <= LIMIT)
		{
			if (getSumOfDivisors(numberToCheck) > numberToCheck)
			{
				abundents.add(numberToCheck);
			} // end if
			numberToCheck++;
		} // end while
		
		boolean[] isSumOfAbundents = new boolean[LIMIT + 1];
		
		for (int x = 0; x < abundents.size(); x++)
		{
			for (int y = 0; y < abundents.size(); y++)
			{
				if (abundents.get(x) + abundents.get(y) <= LIMIT)
				{
					isSumOfAbundents[abundents.get(x) + abundents.get(y)] = true;
				} // end if
			} // end for
		} // end for
		
		for (int x = 1; x <= LIMIT; x++)
		{
			if (!isSumOfAbundents[x])
			{
				sum += x;
				System.out.println(x + " is not sum of abundents. Running sum = " + sum);
			}// end if
		} // end for
		
		System.out.println(sum);
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
