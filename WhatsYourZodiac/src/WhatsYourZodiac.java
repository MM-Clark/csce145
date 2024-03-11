/*
 * Written by Michelle Clark.
 */

/*This program determines zodiac sign for Lab01 of CSCE 145.*/
import java.util.Scanner;

public class WhatsYourZodiac {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Print on the console.
		//Asks the user to input the month and day of their
		//birthday as numbers separated by a space.
		System.out.println("What is your zodiac? Enter your birthday --\r\n"
				+ "Month followed by Day as numbers.");
		
		//Establishes each keyboard entry as 
		//month and day. Uses integers because
		//no decimals should be involved.
		String month = keyboard.next();
		String day = keyboard.next();
		
		//Establishes string for zodiac sign.
		String sign = ""; 
		
		//Error checking implemented to ensure the user enters their birth month and
		//day as numbers. 
		try {
			Integer.parseInt(month);
			Integer.parseInt(day);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid input. Please enter the "
					+ "month and day of your birthday as numbers separated by a space.");
			month = keyboard.next();
			day = keyboard.next();
		}
		
		//Parses the string month to establish the integer m.
		//Parses the string day to establish the integer d. 
		int m = Integer.parseInt(month);
		int d = Integer.parseInt(day);
		//Closes the keyboard. 
		keyboard.close();
		
		//Checks if the month is below 1 or above 12.
		//If so, the month is invalid. 
		if (m < 1 || m > 12) {
			System.out.println("Invalid month!");
		}
		//Otherwise, if the day is between 1 and 31,
		//we keep checking. 
		else {
			if (d > 0 && d < 32) {
				//Checks if the day is above 30 for April, June, September, and November. 
				//If so, it is invalid.
				if (m == 4 || m == 6 || m == 9 || m == 11) {
					if (d > 30) {
						System.out.println("Invalid day!");
					}
				}
				//Otherwise, if the day is above 28 for February, it is invalid.
				else if (m == 2) {
					if (d > 29) {
						System.out.println("Invalid day!");
					}
				}
				//If none of the above conditions apply, the month and day are
				//valid. We can begin determining signs.
				else {
					//If your month is January and the day is 1-19, you are a Capricorn.
					//If not (day above 20), you are an Aquarius. 
					if (m == 1) {
						if (d < 20) {
							sign = "Capricorn";
						}
						else {
							sign = "Aquarius";
						}
					}
					//Otherwise, if your month is February and the day is 1-18, 
					//you are an Aquarius. If it is not (day above 20), you are
					//a Pisces.
					else if (m == 2) {
						if (d < 19) {
							sign = "Aquarius";
						}
						else {
							sign = "Pisces";
						}
					}
					//This check repeats for each month. 
					else if (m == 3) {
						if (d < 21) {
							sign = "Pisces";
						}
						else {
							sign = "Aries";
						}
					}
					else if (m == 4) {
						if (d < 20) {
							sign = "Aries";
						}
						else {
							sign = "Taurus";
						}
					}
					else if (m == 5) {
						if (d < 21) {
							sign = "Taurus";
						}
						else {
							sign = "Gemini";
						}
					}
					else if (m == 6) {
						if (d < 21) {
							sign = "Gemini";
						}
						else {
							sign = "Cancer";
						}
					}
					else if (m == 7) {
						if (d < 23) {
							sign = "Cancer";
						}
						else {
							sign = "Leo";
						}
					}
					else if (m == 8) {
						if (d < 23) {
							sign = "Leo";
						}
						else {
							sign = "Virgo";
						}
					}
					else if (m == 9) {
						if (d < 23) {
							sign = "Virgo";
						}
						else {
							sign = "Libra";
						}
					}
					else if (m == 10) {
						if (d < 23) {
							sign = "Libra";
						}
						else {
							sign = "Scorpio";
						}
					}
					else if (m == 11) {
						if (d < 22) {
							sign = "Scorpio";
						}
						else {
							sign = "Sagittarius";
						}
					}
					else if (m == 12) {
						if (d < 22) {
							sign = "Sagittarius";
						}
						else {
							sign = "Capricorn";
						}
					}
					//Finally, once your sign is determined, the 
					//console prints out "You are a " and your sign 
					//followed by an exclamation point. 
					System.out.println("You are a " + sign +"!");
				}
			}
			//If the day is not between 1 and 31, it is invalid. 
			else {
				System.out.println("Invalid day!");
			}
		}
	}
}
