// Written by Zack Rosales
// Project Euler Problem # 19
// You are given the following information, but you may prefer to do some research for yourself.
// 1 Jan 1900 was a Monday.
// Thirty days has September,
// April, June and November.
// All the rest have thirty-one,
// Saving February alone,
// Which has twenty-eight, rain or shine.
// And on leap years, twenty-nine.
// A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by
// 400.
// How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec
// 2000)?

package ProjectEuler;

public class Problem19
{ // class start
	static final int SUNDAY = 1;
	static final int MONDAY = 2;
	static final int TUESDAY = 3;
	static final int WEDNESDAY = 4;
	static final int THURSDAY = 5;
	static final int FRIDAY = 6;
	static final int SATURDAY = 7;
	
	static int year = 1900;
	static int month = 1;
	static int date = 1;
	static int day = MONDAY;
	static int count = 0;
	
	public static void main(String[] args) // main method start
	{
		while (year < 2001)
		{
			if (date == 1 && day == SUNDAY && year != 1900)
			{
				count++;
			} // end if
			nextDay();
		} // end while
		
		System.out.print(count);
	} // main method end
	
	private static void nextDay() // nextDay method start
	{
		if (date < getDaysInMonth())
		{
			date++;
		} // end if
		else
		{
			if (month < 12)
			{
				month++;
				date = 1;
			} // end if
			else
			{
				year++;
				month = 1;
				date = 1;
			} // end else
		} // end else
		if (day < SATURDAY)
		{
			day++;
		} // end if
		else
		{
			day = SUNDAY;
		} // end else
	} // nextDay method end
	
	private static int getDaysInMonth() // getDaysInMonth method start
	{
		switch (month)
		{
		case 1: return 31;
		case 3: return 31;
		case 5: return 31;
		case 7: return 31;
		case 8: return 31;
		case 10: return 31;
		case 12: return 31;
		case 4: return 30;
		case 6: return 30;
		case 9: return 30;
		case 11: return 30;
		case 2: if (year % 4 == 0)
			{
				if (year % 100 == 0) // if year is a century
				{
					if (year % 400 == 0) // if year is divisible by 400
					{
						return 29;
					} // end if
					else // if year is century but not divisible by 4
					{
						return 28;
					} // end else
				} // end if
				else // if year is not century, but divisible by 4
				{
					return 29;
				} // end else
			} // end if
			else
			{
				return 28;
			} // end else
		default: return 0;
		} // end switch
	} // getDaysInMonth method end
} // class end
