/**
 * Program Name: D_D_Text_Analyzer.java
 * Purpose: This program can be used as a letter counter. It gives the percentage of each letters in 
 *          phrase or a word. 
 * Coder: Danish Davis 0691688
 * Date: Apr 11, 2019
 */
import java.util.*;
public class D_D_Text_Analyzer
{

	public static void main(String[] args)
	{
		//Create scanner
		Scanner input = new Scanner(System.in);
	 //Heading
		System.out.println("Dan's Letter counter program.\n");
		System.out.print("Enter a word or phrase and press ENTER: ");
		//Create a variable to hold the word or phrase
		String phrase = input.nextLine();
		//Print out the input
		System.out.println("\nThe letter counts in '"+ phrase + "' are as follows");
		
		int [] intArray= D_D_IC4_Methods.getLetterCount(phrase);
		D_D_IC4_Methods.printLetterCount(intArray);
		System.out.println("\nHere is the histogram:");
		D_D_IC4_Methods.reportLetterFrequency(null, intArray);

	}
	//end main
}
//end class