// Written by Zack Rosales
// Project Euler Problem # 17
// If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are
// 3 + 3 + 5 + 4 + 4 = 19 letters used in total. If all the numbers from 1 to 1000 (one thousand)
// inclusive were written out in words, how many letters would be used?
// NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23
// letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out
// numbers is in compliance with British usage.

package ProjectEuler;

public class Problem17
{ // class start
	public static void main(String[] args) // main method start
	{
		int num = 1;
		String output;
		long charCount = 0;
		
		while (num <= 1000)
		{
			output = getString(num);
			charCount += getChars(output);
			num++;
		} // end while
		
		System.out.println(charCount);
	} // main method end
	
	private static String getString(int num) // getString method start
	{
		String str = String.format("%d", num);
		String output = "";
		
		if (num == 1000)
		{
			output = "one thousand";
		} // end if
		else
		{
			if (num > 99) // for numbers greater than 100 but less than 1000
			{
				output = getHundreds(str.charAt(0)) + " hundred";
				if (num % 100 != 0)
				{
					output += " and";
					if (str.charAt(1) != '1')
					{
						switch (str.charAt(1))
						{
						case '9': output += " ninety";
							break;
						case '8': output += " eighty";
							break;
						case '7': output += " seventy";
							break;
						case '6': output += " sixty";
							break;
						case '5': output += " fifty";
							break;
						case '4': output += " forty";
							break;
						case '3': output += " thirty";
							break;
						case '2': output += " twenty";
							break;
						default: break;
						} // end switch
						switch (str.charAt(2))
						{
						case '9': output += " nine";
							break;
						case '8': output += " eight";
							break;
						case '7': output += " seven";
							break;
						case '6': output += " six";
							break;
						case '5': output += " five";
							break;
						case '4': output += " four";
							break;
						case '3': output += " three";
							break;
						case '2': output += " two";
							break;
						case '1': output += " one";
						default: break;	
						} // end switch
					} // end if
					else
					{
						switch (str.charAt(2))
						{
						case '0': output += " ten";
							break;
						case '1': output += " eleven";
							break;
						case '2': output += " twelve";
							break;
						case '3': output += " thirteen";
							break;
						case '4': output += " fourteen";
							break;
						case '5': output += " fifteen";
							break;
						case '6': output += " sixteen";
							break;
						case '7': output += " seventeen";
							break;
						case '8': output += " eighteen";
							break;
						case '9': output += " nineteen";
							break;
						} // end switch
					} // end else
				} // end if
			} // end if
			else if (num > 9) // for numbers less than 100, but greater than 10
			{
				if (str.charAt(0) != '1')
				{
					switch (str.charAt(0))
					{
					case '9': output += " ninety";
						break;
					case '8': output += " eighty";
						break;
					case '7': output += " seventy";
						break;
					case '6': output += " sixty";
						break;
					case '5': output += " fifty";
						break;
					case '4': output += " forty";
						break;
					case '3': output += " thirty";
						break;
					case '2': output += " twenty";
						break;
					default: break;
					} // end switch
					switch (str.charAt(1))
					{
					case '9': output += "nine";
						break;
					case '8': output += "eight";
						break;
					case '7': output += "seven";
						break;
					case '6': output += "six";
						break;
					case '5': output += "five";
						break;
					case '4': output += "four";
						break;
					case '3': output += "three";
						break;
					case '2': output += "two";
						break;
					case '1': output += "one";
					default: break;	
					} // end switch
				} // end if
				else
				{
					switch (str.charAt(1))
					{
					case '0': output += " ten";
						break;
					case '1': output += " eleven";
						break;
					case '2': output += " twelve";
						break;
					case '3': output += " thirteen";
						break;
					case '4': output += " fourteen";
						break;
					case '5': output += " fifteen";
						break;
					case '6': output += " sixteen";
						break;
					case '7': output += " seventeen";
						break;
					case '8': output += " eighteen";
						break;
					case '9': output += " nineteen";
						break;
					} // end switch
				} // end else
			} // end else if
			else // for numbers less than 10
			{
				switch (str.charAt(0))
				{
				case '9': output += " nine";
					break;
				case '8': output += " eight";
					break;
				case '7': output += " seven";
					break;
				case '6': output += " six";
					break;
				case '5': output += " five";
					break;
				case '4': output += " four";
					break;
				case '3': output += " three";
					break;
				case '2': output += " two";
					break;
				case '1': output += " one";
				default: break;	
				} // end switch
			}
		} // end else
		
		return output;
	} // getString method end
	
	private static String getHundreds(char input) // getHundreds method start
	{
		String output = "";
		
		switch (input)
		{
		case '1': output = "one";
			break;
		case '2': output = "two";
			break;
		case '3': output = "three";
			break;
		case '4': output = "four";
			break;
		case '5': output = "five";
			break;
		case '6': output = "six";
			break;
		case '7': output = "seven";
			break;
		case '8': output = "eight";
			break;
		case '9': output = "nine";
			break;
		} // end switch
		
		return output;
	} // getHundreds method end
	
	private static long getChars(String input) // getChars method start
	{
		long letterCount = 0;
		
		for (int x = 0; x < input.length(); x++)
		{
			if (Character.isLetter(input.charAt(x)))
			{
				letterCount++;
			} // end if
		} // end for
		
		return letterCount;
	} // getChars method end
} // class end
