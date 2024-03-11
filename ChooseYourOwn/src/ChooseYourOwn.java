/*
 * Written by Michelle Clark.
 */

/*This program is a Choose Your Own Adventure for HW01.*/
//NOTE:Please consider that most of this was written when I was brain dead. No I haven't seen
//Little Einstein or played Undertale (had a lore phase); and, yes, this game has some very 
//weird paths. But consider it a fun little thinking session for yourself, mostly of "Is the
//creator mentally sane?"

//ERROR CHECKING:See lines 55 (try entering a number below 0),
//126 (Try entering a number as a word instead of a value.),
//175 (Checks the length of the string entered. Instead of 'y' or 'n', try entering 'yes' or 'no'.
//and 226 (Checks if the user entered 1 or 2 as the integer values. Try entering a number such as 3.),


import java.util.Scanner; 

public class ChooseYourOwn {
		public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		//Establishes string variables. 
		String planet, pickUpRock, stars, payRespects, getOut, seeHope, boxes, meaningOfLife; 
		
		//Establishes integer variables.
		int seconds, sips, bites, members, doYouStandAlone; 
		
		System.out.println("Welcome to my adventure!");
		System.out.println("You are in space. Would you like to go to 'Mercury' or 'Mars?'");
		
		//User input is stored as the string Planet.
		planet = keyboard.next();
		
		//ERROR CHECK
		while(!(planet.equalsIgnoreCase("Mercury")||planet.equalsIgnoreCase("Mars"))) {
			System.out.println("Invalid input. Please enter 'Mercury' or 'Mars' ignoring case.");
			planet = keyboard.next();
		}
		
		//An if-else-if statement determines if the user entered Mercury or Mars and acts
		//accordingly. 
		if (planet.equalsIgnoreCase("Mercury")) { 
			System.out.println("There is a rock on Mercury. Pick it up ('Yes'/'No')?");
			
			pickUpRock = keyboard.next();
			
			if (pickUpRock.equalsIgnoreCase("Yes")||pickUpRock.equalsIgnoreCase("Y")) {
				System.out.println("You picked up the rock! It turns into a serpant.");
				System.out.println("The serpant wants you dead. How many seconds does it take you to run away (0-3)?");
				
				seconds = keyboard.nextInt();
				
				//ERROR CHECK 0. The system checks whether you entered an amount
				//of seconds below 0 or above 3. Try entering a number like -3. 
				while(seconds<0||seconds>3) {
					System.out.println("Invalid number of seconds. Please enter a numerical value equal to or above 0.");
					seconds = keyboard.nextInt();
				}
				
				//If the seconds value is equal to 0, then this dialogue occurs.
				if(seconds == 0) {
					System.out.println("Smart!");
					System.out.println("You are dehydrated from running.");
					System.out.println("You can have some apple juice and moon food.");
					System.out.println("How many sips of apple juice and how many bites of moon food do you take?");
					System.out.println("Enter the two numbers as numerical integers separated by a space.");
					
					sips = keyboard.nextInt();
					bites = keyboard.nextInt();
					
					//The the sips are greater than bites and bites are less than 7,
					//the program executes Ending 1 dialogue. This is my boolean. 
					if(sips > bites && bites < 7) {
						System.out.println("You died. Good job.");
						System.out.println("Ending 1");
					}
					
					//Otherwise, if the bites are greater than sips or equal, 
					//this dialogue executes. This is another boolean. 
					else if (sips == bites) {
						System.out.println("Sustenance achieved! Good job.");
						System.out.println("You're going on a trip in your favorite rocket ship.");
						System.out.println("Get out of the ship in space ('yes'/'no')?"); 
						
						getOut = keyboard.next();
						
							if (getOut.equalsIgnoreCase("Yes")) {
								System.out.println("You fell into the void. Dude.");
								System.out.println("Ending 2");
							}
							else if (getOut.equalsIgnoreCase("No")) {
								System.out.println("Good job using common sense. You survived and made it home!");
								System.out.println("Ending 3");
							}
					}
					
					//Otherwise, this dialogue executes.
					else {
						System.out.println("Interesting choice. You get food poisoning and an alien eats you.");
						System.out.println("Ending 4");
					}
				}
				//If the above condition doesn't apply and seconds are both greater than 0 and less than 3, this dialogue executes.
				else if(seconds > 0 && seconds < 3) {
					System.out.println("Bit slow but coolio.");
					System.out.println("You see the horizon like in Undertale.");
					System.out.println("You go home.");
					System.out.println("Ending 5");
				}
				//If the above 2 conditions don't apply and seconds equals 3, this dialogue executes. 
				else if(seconds == 3) {
					System.out.println("The serpant caught you. You died.");
					System.out.println("Ending 6");
				}
			}
			else if (pickUpRock.equalsIgnoreCase("No")||pickUpRock.equalsIgnoreCase("N")) {
				System.out.println("You did not pick up the rock. That's sad.");
				System.out.println("You look into the night sky. The stars are beautiful.");
				System.out.println("You reach out and take some for the cold nights when you feel empty inside.");
				System.out.println("How many stars do you take (10-15)?");
				
				stars = keyboard.next(); 
				
				//ERROR CHECK #1. Try entering a word instead of a number. 
				try {
					Integer.parseInt(stars);
				}
				catch(NumberFormatException e) {
					System.out.println(stars + " is not a numerical input");
					System.out.println("Please enter a numerical integer value between 10 and 15.");
					
					stars = keyboard.next(); 
				}
				
				if (stars.equals("10") || stars.equals("15")) {
					System.out.println("That's a nice multiple of five. It's gonna be okay dude.");
					System.out.println("You take the stars with you.");
					System.out.println("They guide you, as you guide all of us.");
					System.out.println("Your legacy continues for all eternity.");
					System.out.println("Ending 7");
				}
				else {
					System.out.println("The stars are warm and fuzzy, and they give you hope.");
					System.out.println("Do you see hope ('yes'/'no')?");
					
					seeHope = keyboard.next();
					
					if (seeHope.equalsIgnoreCase("Yes")||seeHope.equalsIgnoreCase("Y")) {
						System.out.println("That's beautiful.");
						System.out.println("You stand at the edge of reality and contemplate your existance.");
						System.out.println("Even though we are all specks, each speck is significant in a masterpiece.");
						System.out.println("You matter.");
						System.out.println("Ending 8");
					}
					else if (seeHope.equalsIgnoreCase("No")||seeHope.equalsIgnoreCase("N")) {
						System.out.println("You stand here, in the darkness.");
						System.out.println("Even so, you will make it through.");
						System.out.println("Think of the song \"You will be found\" from Dear Evan Hansen");
						System.out.println("I only know it because a fellow skater did it as a program one year.");
						System.out.println("That isn't the point.");
						System.out.println("The point is: You will be found.");
						System.out.println("Ending 9");
					}
				}
			}
		}
		else if (planet.equalsIgnoreCase("Mars")) {
			System.out.println("There is Curiosity the rover. It's dead. Pay respects ('Y'/'N')?");
			
			payRespects = keyboard.next();
			int stringSize = payRespects.length(); 
			
			//ERROR CHECK 2. Try entering an input with more than 1 character in it, 
			//such as yes or no. 
			while(!(stringSize == 1)) {
				System.out.println("Invalid input length. Please enter 'y' or 'n'.");
				
				payRespects = keyboard.next(); 
				stringSize = payRespects.length(); 
			}
			
			if (payRespects.contains("y")) {
				System.out.println("You pay your respects.");
				System.out.println("The deities or non-deities above praise you.");
				System.out.println("You see a figure in the dust.");
				System.out.println("It approaches you and engulfs your being.");
				System.out.println("You are now a part of the hive.");
				System.out.println("How many members of the hive are there?");
				System.out.println("Enter a positive numerical integer value.");
				
				members = keyboard.nextInt();
				
				if (members > 50) {
					System.out.println("You entered over 50 members. Your society takes over the galaxy.");
					System.out.println("Ending 10");
				}
				else if (members < 50 && members > 0) {
					System.out.println("Your society is too small. You collapse and yellow credits starts rolling.");
					System.out.println("Ending 11");
				}
				else if (members == 50) {
					System.out.println("Nice! You found a secret ending!");
					System.out.println("Ending 12 (secret ending)");
				}
			}
			else if (payRespects.contains("n")) {
				System.out.println("You don't pay your respects.");
				System.out.println("Curiosity is offended, so you freeze to death on Mars.");
				System.out.println("In the afterlife, there are five boxes. Choose one (1-5) to determine if you reincarnate yourself.");
				
				boxes = keyboard.next();
				
				if (boxes.equals("5")) {
					System.out.println("There is nothing inside. Your journey ends.");
					System.out.println("Ending 13");
				}
				else if (boxes.equals("2")||boxes.equals("3")) {
					System.out.println("You reincarnate and can rule over all at the cost (or benefit) of eternal solitude.");
					System.out.println("Do you choose (1) to exist alone or (2) to reconnect with the world?");
					System.out.println("Enter the numerical integer 1 or 2.");
					
					doYouStandAlone = keyboard.nextInt();
	 
					//ERROR CHECK 3. Try entering a number that is not 1 or 2..
					while(!((doYouStandAlone==1)||(doYouStandAlone==2))) {
						System.out.println("Input is not a number that is '1' or '2'. Please enter a numerical integer value between 1 and 2.");
						doYouStandAlone = keyboard.nextInt();
					}
					
					if(doYouStandAlone == 1) {
						System.out.println("You rule alone. It is a grand existance, but your hollowness persists.");
						System.out.println("Is it worth it?");
						System.out.println("Ending 14");
					}
					else if(doYouStandAlone == 2) {
						System.out.println("You reenter society, your spirit renewed.");
						System.out.println("Perhaps a simple existance is worthwhile.");
						System.out.println("Perhaps it is beautiful.");
						System.out.println("Ending 15");
					} 
				}
				else {
					System.out.println("A white light appears. It is you, and you are it.");
					System.out.println("A cat comes from the light. It asks you the meaning of life.");
					System.out.println("I'll tell you if you come a little closer.");
					System.out.println("Enter tresed");
					
					meaningOfLife = keyboard.next();
					
					//Extra error check for if the user actually entered 'tresed'.
					//You can try entering different characters to toggle it. 
					while(!meaningOfLife.equalsIgnoreCase("tresed")) {
						System.out.println("You did not follow instructions.");
						System.out.println("To know the meaning of life, please enter 'tresed'.");
						
						meaningOfLife = keyboard.next();
					}
					
					int stringLength = meaningOfLife.length();
					//This rearranges the characters of the string meaningOfLife to spell the word backwards. 
					for(stringLength=meaningOfLife.length(); stringLength>0; --stringLength) {
						System.out.print(meaningOfLife.charAt(stringLength-1));
					}
					System.out.println("\n");
					System.out.println("Ending 16");
				}
			}
		}
		keyboard.close(); 
	}

}
