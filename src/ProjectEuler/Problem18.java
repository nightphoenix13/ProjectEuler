// Written by Zack Rosales
// Project Euler Problem # 18
// By starting at the top of the triangle below and moving to adjacent numbers on the row below,
// the maximum total from top to bottom is 23.
//         3
//        7 4
//       2 4 6
//      8 5 9 3
// That is, 3 + 7 + 4 + 9 = 23
// Find the maximum total from top to bottom of the triangle below:
//                               75
//                             95  64
//                           17  47  82
//                         18  35  87  10
//                       20  04  82  47  65
//                     19  01  23  75  03  34
//                   88  02  77  73  07  63  67
//                 99  65  04  28  06  16  70  92
//               41  41  26  56  83  40  80  70  92
//             41  48  72  33  47  32  37  16  94  29
//           53  71  44  65  25  43  91  43  58  50  27
//         70  11  33  28  77  73  17  78  39  68  17  57
//       91  71  52  38  17  14  91  43  58  50  27  29  48
//     63  66  04  68  89  53  67  30  73  16  69  87  40  31
//   04  62  98  27  23  09  70  98  73  93  38  53  60  04  23

package ProjectEuler;

public class Problem18
{ // class start
	public static void main(String[] args) // main method start
	{
		int row1 = 75;
		int[] row2 = {95, 64};
		int[] row3 = {17, 47, 82};
		int[] row4 = {18, 35, 87, 10};
		int[] row5 = {20, 4, 82, 47, 65};
		int[] row6 = {19, 1, 23, 75, 3, 34};
		int[] row7 = {88, 2, 77, 73, 7, 63, 67};
		int[] row8 = {99, 65, 4, 28, 6, 16, 70, 92};
		int[] row9 = {41, 41, 26, 56, 83, 40, 80, 70, 33};
		int[] row10 = {41, 48, 72, 33, 47, 32, 37, 16, 94, 29};
		int[] row11 = {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14};
		int[] row12 = {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57};
		int[] row13 = {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48};
		int[] row14 = {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31};
		int[] row15 = {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23};
		int subtotal = 0;
		int highest = 0;
		
		for (int a = 0; a < row2.length; a++) // row2 loop
		{
			for (int b = a; b <= a + 1; b++) // row3 loop
			{
				for (int c = b; c <= b + 1; c++) // row4 loop
				{
					for (int d = c; d <= c + 1; d++) // row5 loop
					{
						for (int e = d; e <= d + 1; e++) // row6 loop
						{
							for (int f = e; f <= e + 1; f++) // row7 loop
							{
								for (int g = f; g <= f + 1; g++) // row8 loop
								{
									for (int h = g; h <= g + 1; h++) // row9 loop
									{
										for (int i = h; i <= h + 1; i++) // row10 loop
										{
											for (int j = i; j <= i + 1; j++) // row11 loop
											{
												for (int k = j; k <= j + 1; k++) // row12 loop
												{
													for (int l = k; l <= k + 1; l++) // row13 loop
													{
														for (int m = l; m <= l + 1; m++) // row14 loop
														{
															for (int n = m; n <= m + 1; n++) // row15 loop
															{
																subtotal = row1 + row2[a] + row3[b] +
																		row4[c] + row5[d] + row6[e] +
																		row7[f] + row8[g] + row9[h] +
																		row10[i] + row11[j] + row12[k]
																		+ row13[l] + row14[m] +
																		row15[n];
																if (subtotal > highest)
																{
																	highest = subtotal;
																} // end if
															} // end for
														} // end for
													} // end for
												} // end for
											} // end for
										} // end for
									} // end for
								} // end for
							} // end for
						} // end for
					} // end for
				} // end for
			} // end for
		} // end for
		
		System.out.println(highest);
	} // main method end
} // class end
