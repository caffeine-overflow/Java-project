/**
 * Program Name: D_D_IC4_Methods.java
 * Purpose     : This is the "HELPER" or "UTILITY" class that just holds a bunch of methods
 *                that do various things. 
 * Coder       : Danish Davis 0691688
 * Date        : Apr 11, 2019
 */

public class D_D_IC4_Methods
{
 public static int[] getLetterCount(String a)
 {

	 //changing the string or phrase to upper case
	 a =a.toUpperCase();
	 char[] charArray = a.toCharArray();//converting string to char and storing in a char array
	 int intValue = 0;
	 int [] intArray= new int[26];
	 for(int index=0; index<charArray.length; index++)
	 {
		 if( Character.isLetter(charArray[index])==true)
			 {
				 intValue = charArray[index]-65;
				  intArray [intValue]++;
		   }
	 }	
	 return intArray;
 }
 public static void printLetterCount(int []array)
 {
	 String [] letterArray= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	 int numChar=0;
	 double average = 0;
	 for(int index=0; index<array.length; index++)//For loop to count number of letters in total in the phrase 
	 {
		numChar+=array[index];
	 }
	 for(int index=0; index<array.length; index++)// for loop to populate the array.
	 {
		 if(index % 2 == 0)
			{
				System.out.println();//just to move the cursor down to next line
			}
		  average= (double)array[index]/numChar*100.0;//Calculating the average here
		  average*=100;// rounding 
		  int temp=(int) average;
		  average=temp/100.0;
			System.out.print("# of "+ letterArray[index] + "'s: "+array[index] +" or "+average+"%"+"     	 ");
	 }
 }
 public static void reportLetterFrequency(String userString, int[] array)
 {
	 char letter =65;
	 for(int index=0; index<26;index++)
	 {
		System.out.print("\n"+(char) (letter+index) + ": ");
		int number= array[index];
		 
		 for(int counter=0;counter<number; counter++ )
		 {
			 System.out.print("I");
		 }
	 }
 }
}
//end class