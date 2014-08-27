// Written by Zack Rosales
// Project Euler Problem # 22
// Using names.txt, a 46K text file containing over five-thousand first names, begin by sorting it
// into alphabetical order. Then working out the alphabetical value for each name, multiply this value
// by its alphabetical position in the list to obtain a name score.
// For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9
// + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
// What is the total of all the name scores in the file?

package ProjectEuler;

import java.io.*;
import java.util.*;

public class Problem22
{ // class start
	private static final String FILENAME = "names.txt";
	private static Scanner input;
	
	public static void main(String[] args) // main method start
	{
		ArrayList<String> names = new ArrayList<String>();
		int nameTotal;
		int runningScore = 0;
		
		openFile();
		
		while (input.hasNext())
		{
			names.add(input.next());
		} // end while
		
		input.close();
		
		Collections.sort(names);
		
		for (int x = 0; x < names.size(); x++)
		{
			int line = x + 1;
			nameTotal = getNameScore(names.get(x), line);
			runningScore += nameTotal;
			System.out.println(line + " " + names.get(x) + " " + nameTotal + " " + runningScore);
		} // end for
		
		System.out.println("Total score: " + runningScore);
	} // main method end
	
	private static void openFile() // openFile method start
	{
		try
		{
			input = new Scanner(new File(FILENAME));
			input.useDelimiter(",");
		} // end try
		catch (FileNotFoundException exception)
		{
			System.err.println("Error opening file.");
			System.exit(1);
		} // end catch
	} // openFile method end
	
	private static int getNameScore(String name, int count) // getNameScore method start
	{
		int score = 0;
		
		for (int x = 0; x < name.length(); x++)
		{
			score += getLetterScore(name.charAt(x));
		} // end for
		
		score = score * count;
		
		return score;
	} // getNameScore method end
	
	private static int getLetterScore(char letter) // getLetterScore method start
	{
		letter = Character.toLowerCase(letter);
		
		switch (letter)
		{
		case 'a': return 1;
		case 'b': return 2;
		case 'c': return 3;
		case 'd': return 4;
		case 'e': return 5;
		case 'f': return 6;
		case 'g': return 7;
		case 'h': return 8;
		case 'i': return 9;
		case 'j': return 10;
		case 'k': return 11;
		case 'l': return 12;
		case 'm': return 13;
		case 'n': return 14;
		case 'o': return 15;
		case 'p': return 16;
		case 'q': return 17;
		case 'r': return 18;
		case 's': return 19;
		case 't': return 20;
		case 'u': return 21;
		case 'v': return 22;
		case 'w': return 23;
		case 'x': return 24;
		case 'y': return 25;
		case 'z': return 26;
		default: return 0;
		} // end switch
	} // getLetterScore method end
} // class end
