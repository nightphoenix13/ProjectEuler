// Written by Zack Rosales
// Project Euler Problem # 15
// Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
// there are exactly 6 routes to the bottom right corner. How many such routes are there through a
// 20×20 grid?

package ProjectEuler;

import javax.swing.JOptionPane;

public class Problem15
{ // class start
	public static void main(String[] args) // main method start
	{
		int rows = 21,
			columns = 21;
		long [][] paths = new long[rows][columns];
		boolean firstPass = true;
		
		// initiating first row as 1
		for (int x = 0; x < columns; x ++)
		{
			paths[0][x] = 1;
		} // end for
		
		// stepping through each other row of the array
		for (int x = 1; x < rows; x++)
		{
			// stepping through columns, starting with element x
			for (int y = x; y < columns; y++)
			{
				// if this is the first pass on this row, element is double the one above
				if (firstPass)
				{
					paths[x][y] = paths[x - 1][y] * 2;
					firstPass = false;
				} // end if
				// if not the first pass for this row, element is equal to the sum of the element before and above it
				else
				{
					paths[x][y] = paths[x - 1][y] + paths[x][y - 1];
				} // end else
			} // end for
			firstPass = true;
		} // end for
		
		// printing output
		for (int x = 0; x < rows; x++)
		{
			for (int y = 0; y < columns; y++)
			{
				System.out.print(paths[x][y] + " ");
			} // end for
			System.out.println();
		} // end for
	} // main method end
} // class end
