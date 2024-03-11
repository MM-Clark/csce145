/*
 * Written by Michelle Clark
 */

import java.util.Scanner;

public class TriangleMaker {
	//This string establishes the color of the text printed to the screen.
	public static final String ansiBlue = "\u001B[34m";
	//This String establishes the color of the stars when they print to the screen. 
	public static final String ansiCyan = "\u001B[36m";
	//This one makes the color of the loading text purple. 
	public static final String ansiPurple = "\u001B[35m";
	//Error and shutdown messages are red. 
	public static final String ansiRed = "\u001B[31m";
	//This one resets the color of text. 
	public static final String ansiReset = "\u001B[0m";
	
	public static void main(String[] args) 
	{
		//This sets up the keyboard for user input.
		Scanner keyboard = new Scanner(System.in);
		while(true) 
		{
			//This prints text to the screen asking the user to enter the amount of rows for the triangle to be.
			System.out.println(ansiBlue + "Enter how many rows you want the star pyramid to be" + ansiReset);
			//These integers are established as the amount of rows, stars, and spaces between each star. 
			String userInput = keyboard.next();
			//This try catch sees if the user actually put in a numerical integer value. 
			//If not, shutdown sequence is initiated. 
			try 
			{
				Integer.parseInt(userInput);
			}
			catch(NumberFormatException e) 
			{
				System.out.println(ansiRed + "NUMBER FORMAT ERROR: CAN ONLY PROCESS NUMERICAL INPUT" + ansiReset);
				break;
			}
			//This takes the user input and parses it into an integer.
			int size = Integer.parseInt(userInput);
			//If the user Input is a number less than or equal to 0, shutdown sequence is 
			//initiated. 
			if(size<=0) 
			{
				System.out.println(ansiRed + "INVALID INTEGER ERROR: CANNOT MAKE PYRAMID OF SIZE LESS THAN OR EQUAL TO 0" + ansiReset);
				break;
			} 
		
			System.out.println(ansiPurple + "Printing..." + ansiReset);
			System.out.println();
			//This for loop prints out to the largest of the top rows. 
			//I is initialized to one. For at least one duration and i is less than or 
			//equal to the max number of stars (size), it increments up 
			//by one.
			for(int i = 1; i <= size; i++) 
			{
				//J is initialized to 1. Less than or equal to i, it increments up by 
				//one each cycle. Each cycle prints out a star and a space. 
				for(int j = 1; j <= i; j++) {
					System.out.print(ansiCyan + "*" + ansiReset);
				}
				System.out.println();
			}
			//This for loop prints out the bottom rows.
			//I is initialized to one. For at least one duration and i is less than or 
			//equal to size, it increments up by one. 
			for(int i = 1; i <= size; i++) 
			{
				//J is initialized to 1. For j is less than or equal to size-i, j increases
				//by one each cycle and prints out a star and a space. 
				for(int j =1; j <= size-i; j++) 
				{
					System.out.print(ansiCyan + "*" + ansiReset);
				}
				System.out.println();
			}
			
			String letsGo;
			System.out.println(ansiBlue+"Do you want to print another star pyramid?"+ansiReset); 
			
			System.out.println(ansiBlue+"Enter 'y' or 'n'"+ansiReset);
			letsGo = keyboard.next();
			//I could have done this with the "y" case in another while loop, but that
			//is kind of complicated, so we have this. Plus this gets the job done. 
			
			//If the user says no, the while loop breaks and the program shuts down.
			if(letsGo.equalsIgnoreCase("n")||letsGo.equalsIgnoreCase("no")) 
			{
				System.out.println(ansiPurple + "aw!" + ansiReset);
				break; 
			}
			//Otherwise, the program executes this text and loops around. 
			else if(letsGo.equalsIgnoreCase("y")||letsGo.equalsIgnoreCase("yes")) 
			{
				System.out.println(ansiPurple+"Yeah! We're cycling around!"+ansiReset);
			}
		}
		//This is the shutdown sequence. It tells the user that the program is shutting
		//down and closes the Scanner keyboard. 
		System.out.println(ansiRed+"Shutting down..."+ansiReset);
		keyboard.close();
	}

}
