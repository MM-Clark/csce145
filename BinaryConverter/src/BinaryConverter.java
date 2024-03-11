/*
 * Written by Michelle Clark
 */

//Java program to convert two binary numbers to two decimal numbers that will be added together

//Gets the Scanner class from the package (library) java.util 

import java.util.Scanner;
import javax.swing.JOptionPane;

//THE PROGRAM WAS UPDATED TO ERROR CHECK AND ONLY COMPUTE VALUES IF VALID INPUTS
//ALSO INCORPORATED JOPTIONPANE BECAUSE WHY NOT
//YOU CAN REENTER IF YOU INPUT A STRING
//IF YOU INPUT TWO NONBINARY NUMBERS THE PROGRAM HARRASSES YOU

//also if you have other grading to do you can totally ignore this nonsense

//Name of the class. Should match the program name. 
public class BinaryConverter
{	
	
	public static void main(String[] args) 
	{	
		//Readies the program for keyboard input. 
		Scanner keyboard = new Scanner(System.in);
		
		//Sends output to the screen stating the purpose of the program. 
		JOptionPane.showMessageDialog(null,"Hello out there. I will convert two binary numbers "
				+ "to decimals and then add them together for you.");
		//Also prompts the user for input. 
		String n1=
		JOptionPane.showInputDialog("Enter the first binary number of any length.");
		
		//Parse long of first input to get binary number 1
		try
		{
			long check1 = Long.parseLong(n1);
		}
		catch(NumberFormatException e)
		{
			n1=JOptionPane.showInputDialog("That's not a number. Try again");
		}
		long binaryNumber1 = Long.parseLong(n1); 
		
		//now for the second one
		String n2=
		JOptionPane.showInputDialog("Now enter the second binary number.");
 
		try
		{
			long check2 = Long.parseLong(n1);
		}
		catch(NumberFormatException e)
		{
			n2=JOptionPane.showInputDialog("That's not a number. Try again");
		}
		//Parse long of second input to get binary number 2
		long binaryNumber2 = Long.parseLong(n2);
				
		//Closes Scanner to prevent leak warning.
		keyboard.close(); 
		
		//Says that power1 and power2 are variables holding integers, which are 4 bytes.
		//These will be used to denote the power of 2 the binary digit will be multiplied
		//by. See below.
		//1 corresponds to binaryNumber1.
		//2 corresponds to binaryNumber2.
		int power1 = 0;
		int power2 = 0;
				
		//Establishes remainder variables as longs. See below.
		//1 corresponds to binaryNumber1.
		//2 corresponds to binaryNumber2.
		//These will be used to hold the values of the results of taking the remainder of 
		//each binary number after dividing by 10. 
		long remainder1 = 0;
		long remainder2 = 0;
				
		//Establishes variables of sums of the converted bits.
		//1 corresponds to binaryNumber1.
		//2 corresponds to binaryNumber2.
		long decimalNumber1 = 0;
		long decimalNumber2 = 0;
				
		//Establishes variable for when decimal outputs will be added together.
		long decimalSum; 
		
		//Find remainder of the first binary number divided by ten. 
		remainder1 = binaryNumber1 % 10;
		remainder2 = binaryNumber2 % 10;
		
		if(!(remainder1 == 0 || remainder1 == 1))
		{
			JOptionPane.showMessageDialog(null, "First binary invalid");
		}
		if(!(remainder2 == 0 || remainder2 ==1))
		{
			JOptionPane.showMessageDialog(null, "Second binary invalid");
		}
		
		//If the first binary number is greater than 0, the program converts it to a decimal. 
		while(binaryNumber1 > 0 && (remainder1 == 0 || remainder1 == 1)) 
		{
					
			//Multiplies each binary digit by its corresponding base 2 placement value
			//and adds the values together to get the decimal value. 
			decimalNumber1 = (long)(decimalNumber1 + remainder1 * Math.pow(2, power1));
						
			//Prepares the system for the next digit of the binary number. 
				binaryNumber1 = binaryNumber1 / 10;	 
						
			//Increases the power of the base two value that the binary number 
			//will be multiplied by.  
			power1++;
			
		}
		
		//If the second binary number is greater than 0, the program converts it to a decimal. 
		while(binaryNumber2 > 0 && (remainder2 == 0 || remainder2 ==1)) 
		{
					
			//Multiplies each binary digit by its corresponding base 2 placement value
			//and adds the values together to get the decimal value.
			decimalNumber2 = (long)(decimalNumber2 + remainder2 * Math.pow(2, power2));
						
			//Prepares the system for the next digit of the binary number.
			binaryNumber2 = binaryNumber2 / 10;  
			
			//Increases the power of the base two value that the binary number 
			//will be multiplied by. 
			power2++;
		}
		
		if(remainder1 == 0 || remainder1 == 1||remainder2 == 0 || remainder2 ==1)
		{
			//Prints the two decimal values and states that addition of the values will commence. 
			JOptionPane.showMessageDialog(null,
				"The decimal values are " + decimalNumber1 + " and " + decimalNumber2);
			JOptionPane.showMessageDialog(null,
				"I will now add the decimal values for you.");
			//Adds the two sums and makes them equal to the variable decimalSum. 
			decimalSum = decimalNumber1 + decimalNumber2; 
		
			//Sends output of the added decimals to the screen. 
			JOptionPane.showMessageDialog(null,
				"The sum of the decimal values is " + decimalSum);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "womp womp 👎");
			
		}
		System.exit(0);
		
	}
	
}