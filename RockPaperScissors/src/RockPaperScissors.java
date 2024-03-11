/*
 * Written by Michelle Clark. 
 */
import java.util.Scanner; 
import java.util.Random; 

//I added some error checking in the event that the user doesn't use the same option
//3 times but still shows preference for one option (aka if uses scissors twice,
//computer will choose rock the next round every time). 

public class RockPaperScissors {
	//This one is really hard to read with black background. 
	public static final String ansiBlue = "\u001B[34m";
	 
	public static final String ansiCyan = "\u001B[36m";
	//So is this one. 
	public static final String ansiPurple = "\u001B[35m";
	
	public static final String ansiRed = "\u001B[31m";
	
	public static final String ansiYellow = "\033[0;33m";
	 
	public static final String ansiReset = "\u001B[0m";
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int userScore = 0; 
		int computerScore = 0;
		int match = 1;
		
		//Additional counters; don't reset after each round
		int rockTotal = 0;
		int paperTotal = 0;
		int scissorsTotal = 0;
		
		boolean likesRock=false;
		boolean likesPaper=false;
		boolean likesScissors=false;
		
		boolean gameOver=false;
		//This code runs at least once, repeats for as long as gameOver is false.
	
		do
		{
		int rock = 0;
		int paper = 0;
		int scissors = 0;
			for(int i = 1; i<4; i++)
			{
				System.out.println(ansiPurple + "Match " + match + " of however long you do this");
				System.out.println("Round " + i + " of 3"+ansiReset);
				System.out.println(); 
				//1. Randomized computer move
				String[]availableMoves = {"rock", "paper", "scissors"};
				String computerMove;
				//Exploiting users. 
				if(likesRock==true) 
				{
					computerMove = "paper";
				}
				else if(likesPaper==true) 
				{
					computerMove = "scissors";
				}
				else if(likesScissors==true) 
				{
					computerMove = "rock";
				}
				else 
				{
					//using Random() function on indices of array to choose random move.
					computerMove = availableMoves[new Random().nextInt(availableMoves.length)];
				}
				System.out.println(ansiYellow + "Computer has chosen it's move.");
				System.out.println("Choose your move. Best of luck." + ansiReset);
			
				//2. Player move
			
				//Player input string is declared. 
				String userMove;
			
				//User chooses their move. 
				//I ADDED ERROR CHECKING (yay.)
				do 
				{
					System.out.println(ansiYellow + "Please choose your move.");
					System.out.println("Enter 'rock', 'paper', or 'scissors'." + ansiReset); 
					userMove = keyboard.nextLine();
				}
				while(!(userMove.equals("rock")||userMove.equals("scissors")||userMove.equals("paper")));
				System.out.println();
				//CHECKING FOR REPEATED MOVES
				if(userMove.equals("rock")) 
				{
					rock++;
					rockTotal++;
				}
				else if(userMove.equals("paper")) 
				{
					paper++;
					paperTotal++;
				}
				else if(userMove.equals("scissors")) 
				{
					scissors++;
					scissorsTotal++;
				}
				//3. Comparing moves and deciding the winner
			
				//check for tie
				if(userMove.equals(computerMove)) 
				{
					System.out.println(ansiCyan + "Tie! No points awarded." + ansiReset);
				}
			
				//Checks all other scenarios. 
				else if(userMove.equals("rock")) 
				{
				
					if(computerMove.equals("paper")) 
					{ 
						System.out.println(ansiCyan + "Computer wins!");
						System.out.println("Oof. Better luck next time." + ansiReset);
						computerScore++;
					}
					else if(computerMove.equals("scissors")) 
					{
						System.out.println(ansiCyan + "You beat the robots!");
						System.out.println("Good job!" + ansiReset);
						userScore++;
					}
				}
			
				else if(userMove.equals("paper")) 
				{
				
					if(computerMove.equals("rock")) 
					{
						System.out.println(ansiCyan + "You are victorious!");
						System.out.println("Congrats!" + ansiReset);
						userScore++;
					}
					else if(computerMove.equals("scissors")) 
					{
						System.out.println(ansiCyan + "Technology wins!");
						System.out.println("Try harder next time?" + ansiReset);
						computerScore++;
					}
				}
			
				else if(userMove.equals("scissors")) 
				{
				
					if(computerMove.equals("paper")) 
					{
						System.out.println(ansiCyan + "You are the champion, mate!");
						System.out.println("What? You want a standing ovation?" + ansiReset);
						userScore++;
					}
					else if(computerMove.equals("rock")) 
					{
						System.out.println(ansiCyan + "The robot overlords remain undefeated.");
						System.out.println("Better luck next time." + ansiReset);
						computerScore++;
					}
				}
			
				else 
				{
					System.out.println(ansiCyan + "Computer wins!");
					System.out.println("Try entering something valid next time." + ansiReset);
					computerScore++;
				}
				//Prints out computer choice. 
				System.out.println(); 
				System.out.println(ansiRed + "Computer chose: " + computerMove);
				System.out.println("You have " + userScore + " points.");
				System.out.println("Computer has " + computerScore + " points." + ansiReset);	
				System.out.println();
				
				String proceed;
				
				while(i<4) {
					if(i<3) {
						System.out.println(ansiPurple + "Type 'ok' to continue to next round." + ansiReset);
					}
					else if(i==3) {
						System.out.println(ansiPurple + "Type 'ok' to see match results." + ansiReset);
					}
					proceed = keyboard.nextLine();
				
					if(proceed.equalsIgnoreCase("ok")) 
					{
						break;
					}
				}
				System.out.println();
				for(int b=0; b<100; b++)
				{
				System.out.print("*");
				}
				System.out.println();
				System.out.println();
			}
			//After 3 rounds, score is calculated. 
			System.out.println(ansiCyan + "Time's up!" + ansiReset);
			System.out.println(ansiRed + "Your final score: " + userScore);
			System.out.println("Computer final score: " + computerScore + ansiReset);
			if(userScore<computerScore) {
				System.out.println(ansiYellow + "Computer wins overall with "+computerScore+" of 3 rounds!" + ansiReset);
			}
			else if(userScore>computerScore) {
				System.out.println(ansiYellow + "You win overall with "+userScore+" of 3 rounds!" + ansiReset);
			}
			else if(userScore == computerScore) {
				System.out.println(ansiYellow + "There are no winners in the game of life.");
				System.out.println("You both got " + computerScore + " points.");
				System.out.println("Achievement unlocked: tie." + ansiReset);
			}
			else{
				System.out.println(ansiRed + "Something went very wrong. Oh no." + ansiReset);
			}
			//Storing values to exploit for next time. 
			if(rock==3||paper==3||scissors==3) 
			{
				if(rock==3) 
				{
					likesRock=true; 
					likesScissors=false;
					likesPaper=false;
				}
				if(paper==3) 
				{
					likesPaper=true;
					likesRock=false;
					likesScissors=false;
				}
				if(scissors==3) 
				{
					likesScissors=true;
					likesRock=false;
					likesPaper=false;
				}
			}
			else if(rock>paper&&rock>scissors) 
			{
				likesRock=true;
				likesPaper=false;
				likesScissors=false;
			}
			else if(paper>rock&&paper>scissors) 
			{
				likesPaper=true;
				likesRock=false;
				likesScissors=false;
			}
			else if(scissors>rock&&scissors>paper) 
			{
				likesScissors=true;
				likesRock=false;
				likesPaper=false;
			}
			else if(rock>paper&&rock>scissors) 
			{
				likesRock=true;
				likesPaper=false;
				likesScissors=false;
			}
			//CHECKS TOTAL TENDENCIES IN EVENT CURRENT ROUND SHOWS NO TENDENCIES
			else if(rockTotal>paperTotal&&rockTotal>scissorsTotal) 
			{
				likesRock=true;
				likesPaper=false;
				likesScissors=false;
			}
			else if(paperTotal>rockTotal&&paperTotal>scissorsTotal) 
			{
				likesPaper=true;
				likesRock=false;
				likesScissors=false;
			}
			else if(scissorsTotal>rockTotal&&scissorsTotal>paperTotal) 
			{
				likesScissors=true;
				likesRock=false;
				likesPaper=false;
			}
			else 
			{
				likesRock=false;
				likesPaper=false;
				likesScissors=false;	
			}

			
			String rematch; 
			System.out.println(ansiBlue + "Wanna go for another 3 rounds?" + ansiReset);
			//I finally decided to implement do while loops to make things more efficient.
			//This error checks the user input to make sure the user follows instructions.
			do
			{
			System.out.println(ansiBlue + "Type 'y' or 'n'." + ansiReset);
			rematch = keyboard.nextLine(); 
			}
			while(!(rematch.equalsIgnoreCase("n")||rematch.equalsIgnoreCase("y"))); 
			
			if(rematch.equalsIgnoreCase("n")) 
			{
				//Setting the boolean to true breaks the condition of the while loop.
				gameOver=true; 
			}
			else if(rematch.equalsIgnoreCase("y")) 
			{
				gameOver=false;
				System.out.println();
				for(int a=0;a<100;a++) 
				{
				System.out.print("$");
				}
				System.out.println();
				System.out.println();
				userScore = 0;
				computerScore = 0; 
				match++;
			}
		}
		while(gameOver==false);
		System.out.println(ansiRed + "Shutting down. Goodnight." + ansiReset);
		keyboard.close();
	}
}
