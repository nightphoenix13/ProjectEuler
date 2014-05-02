// Written by Zack Rosales
// This program finds the solution of Project Euler problem 13
// The following iterative sequence is defined for the set of positive integers:
// n > n/2 (n is even)
// n > 3n + 1 (n is odd)
// Using the rule above and starting with 13, we generate the following sequence:
// 13 > 40 > 20 > 10 > 5 > 16 > 8 > 4 > 2 > 1
// It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
// Which starting number, under one million, produces the longest chain?
// NOTE: Once the chain starts the terms are allowed to go above one million.

package ProjectEuler;

public class Problem14 // Problem14 class start
{
	public static void main(String[] args) // main method start
	{
		final long MAX = 1000000;
		long highTerms = 0,
			 terms = 0,
			 highest = 0;
		
		for (long x = 1; x < MAX; x++)
		{
			terms = getTerms(x);
			if (terms > highTerms)
			{
				highTerms = terms;
				highest = x;
			} // end if
		} // end for
		System.out.println(String.format("The number with the most terms is %d", highest));
	} // main method end
	
	// getTerms method finds the number of terms per number
	private static long getTerms(long num)
	{
		long terms = 1;
		boolean one = false;
		
		System.out.print(String.format("Number: %d", num));
		
		while (!one)
		{
			if (num == 1)
			{
				one = true;
				System.out.print(String.format(" > 1\nTerms: %d\n", terms));
				return terms;
			} // end if
			else if(num % 2 == 0)
			{
				num = num / 2;
				terms++;
				System.out.print(String.format(" > %d", num));
			} // end else if
			else
			{
				num = ((num * 3) + 1);
				terms++;
				System.out.print(String.format(" > %d", num));
			} // end else
		} // end while
		return terms;
	} // getTerms method end
} // Problem14 class end
