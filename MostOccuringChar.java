package com.bharath.javaprograms.charcount;

import java.util.Scanner;

public class MostOccuringChar {
/* In order to accomplish finding which character occurs the most in a string we are going
 to use the ASCII representations of the characters within the given string*/
	public static void main(String[] args) {
//		we will create a scanner to point to System.in so we can receive user input; We are assigning it to a local variable named Scanner 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
//			We will use .nextLine() to advance the 's' string scanner to the next line
			String s = scanner.nextLine();
//			This array will store the count of all 256 ASCII characters
			int arr[] = new int [256];
/*			Iterate through each char in the length of string 's';
            By the end of the loop the array will have count for all the characters, stored in their ASCII indexes*/
			for(int i = 0; i < s.length(); i++){
/*				We are taking the character at the current index, and converting it to ASCII; 
				We are then using it as a index and incrementing the count of that index each time it is found*/ 
				arr[(int)s.charAt(i)]++;
			}
			
/*			We want to find the index that has the maximum value (most occurring);
			To do this we need to start the max at index 0;	*/			
			int max = 0;
/*			If the value at array index 1 is greater than the array index zero 
 * 			then we assign that value as the max value and so on */
			for(int j = 1; j < arr.length; j++) {
//				//Within this loop we will check if the array of j is greater that array of max, if so then max is equal to j.
				if(arr[j]>arr[max]) {
//					'Max' will have the index that hold the max value (Most occurring)
					max = j;
				}
			}
//			Print out most occurring character; Must convert to character by typecasting to 'char' 
			System.out.println("Most occuring character is: "+(char)max);
			scanner.close();
			

	}

}
