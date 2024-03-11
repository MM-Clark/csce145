/*
 * Written by Michelle Clark
 */
//Write a game where you are a car, represented by the character 'X' trying to
//avoid potholes in order to get home(oh so just like at home because Brookside 
//is bad about that, like really bad). As visibility is very low, the car can 
//only move one space at a time, and if the space is a pothole, then the player
//loses, and the game is over. However, if they managed to reach home, the player won
//and the game is over.

//Sorry about the comment overloading. It kind of just happened. Oops...
import java.util.Random;
import java.util.Scanner; 

public class PotholeDriving 
{
	//Yes, we're using ansi colors to brighten up the world or something.
	//Think of that one SpongeBob reference
	public static final String ansiBlue = "\u001B[34m";
	 
	public static final String ansiCyan = "\u001B[36m";
	
	public static final String ansiPurple = "\u001B[35m";
	
	public static final String ansiRed = "\u001B[31m";
	
	public static final String ansiYellow = "\033[0;33m";
	 
	public static final String ansiReset = "\u001B[0m";
	//ooh we're setting up the size of the board to later be established in the 
	//board matrix
	public static final int boardSize = 10;
	
	//establishing characters for empty spaces, player, where the player went,
	//and the goal space
	public static final char empty = '_';
	//this represents the car because why not just call it player
	public static final char player = 'X';
	public static final char walkedPath = '#';
	public static final char home = '^';
	
	//note that the pothole characters match empty spaces
	//oh no--you don't know where they go until you hit them
	public static final char pothole1 = '_';
	public static final char pothole2 = '_';
	public static final char pothole3 = '_';
	public static final char pothole4 = '_';
	public static final char pothole5 = '_';
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		//I don't set these to zero until we enter the do while loop
		//to ensure that it resets the player position every time we 
		//start a new round (sorry about the royal we; I used to coach little kids)
		int playerX=0;
		int playerY=0;
		
		int homeX=9;
		int homeY=9;
		
		int pothole1X;
		int pothole2X;
		int pothole3X;
		int pothole4X;
		int pothole5X;
		
		int pothole1Y;
		int pothole2Y;
		int pothole3Y;
		int pothole4Y;
		int pothole5Y;
		
		boolean runProgram = true; 
			
		//pothole 1 established
		do
		{
			pothole1X = r.nextInt(boardSize);
		}while(pothole1X == 0 ||pothole1X == homeX);
		do
		{
			pothole1Y = r.nextInt(boardSize);
		}while(pothole1Y == 0||pothole1Y == homeY);
		
		//pothole 2 established 
		do
		{
			pothole2X = r.nextInt(boardSize);
		}while(pothole2X == 0||pothole2X == homeX || pothole2X == pothole1X);
		do
		{
			pothole2Y = r.nextInt(boardSize);
		}while(pothole2Y==0||pothole2Y == homeY || pothole2Y == pothole1Y);
		
		//pothole 3 established
		do
		{
			pothole3X = r.nextInt(boardSize);
		}while(pothole3X==0||pothole3X == homeY || pothole3X == pothole1X || pothole3X == pothole2X);
		do
		{
			pothole3Y = r.nextInt(boardSize);
		}while(pothole3Y==0||pothole3Y == homeY || pothole3Y == pothole1Y || pothole3Y == pothole2Y);
		
		//pothole 4 established
		do
		{
			pothole4X = r.nextInt(boardSize);
		}while(pothole4X==0||pothole4X == homeX || pothole4X == pothole1X || pothole4X == pothole2X || pothole4X == pothole3X);
		do
		{
			pothole4Y = r.nextInt(boardSize);
		}while(pothole4Y==0||pothole4Y == homeY || pothole4Y == pothole1Y || pothole4Y == pothole2Y || pothole4Y == pothole3Y);
		
		//pothole 5 established
		do
		{
			pothole5X = r.nextInt(boardSize);
		}while(pothole5X==0||pothole5X == homeX || pothole5X == pothole1X || pothole5X == pothole2X || pothole5X == pothole3X || pothole5X == pothole4X);
		do
		{
			pothole5Y = r.nextInt(boardSize);
		}while(pothole5Y==0||pothole5Y == homeY || pothole5Y == pothole1Y || pothole5Y == pothole2Y || pothole5Y == pothole3Y || pothole5Y == pothole4Y);
		
		//This do while loop is in charge of running the general program.
		//If I implemented it before generating the potholes we could have a
		//very nice random generation of the board for each round, but, alas,
		//this assignment requires the board to inherit its potholes from the 
		//first round for each subsequent round. 
		do
		{
			playerX=0;
			playerY=0; 
			
			char[][]board = new char[boardSize][boardSize];
		
			for(int i=0;i<board.length;i++) 
			{
				for(int j=0;j<board.length;j++) 
				{
					board[i][j] = empty; 
				}
			}
		
			board[playerY][playerX] = player; 
			board[homeX][homeY] = home;
			board[pothole1Y][pothole1X] = pothole1;
			board[pothole2Y][pothole2X] = pothole2;
			board[pothole3Y][pothole3X] = pothole3;
			board[pothole4Y][pothole4X] = pothole4;
			board[pothole5Y][pothole5X] = pothole5;
		
			System.out.println(ansiPurple+"Welcome to Pothole Driving!"+ansiReset);
			boolean gameOver = false; 
			
			//This one is for each round. 
			do
			{
				//movement of player 
				for(int i=0;i<board.length;i++) 
				{
					for(int j=0;j<board.length;j++) 
					{
						System.out.print(board[i][j]);
					}
					System.out.println(); 
				}
			
				String direction;  
			
				do
				{
					System.out.println(ansiBlue+"Enter either N, S, W, E, NW, NE, SW, or SE to move your car.");
					System.out.println("Case does not matter.");
					System.out.println("Also press X to exit the program."+ansiReset);
					direction = keyboard.next(); 
				}while(!(direction.equalsIgnoreCase("X")||direction.equalsIgnoreCase("N")||direction.equalsIgnoreCase("S")||direction.equalsIgnoreCase("W")
						||direction.equalsIgnoreCase("E")||direction.equalsIgnoreCase("NW")||direction.equalsIgnoreCase("NE")||
						direction.equalsIgnoreCase("SW")||direction.equalsIgnoreCase("SE")));
			
				int dX=-3;
				int dY=-3; 
			
				if(direction.equalsIgnoreCase("N"))
				{
					dX=0;
					dY=-1;
				}
				else if(direction.equalsIgnoreCase("S"))
				{
					dX=0;
					dY=1;
				}
				else if(direction.equalsIgnoreCase("E"))
				{
					dX=1;
					dY=0;
				}
				else if(direction.equalsIgnoreCase("W"))
				{
					dX=-1;
					dY=0;
				}
				else if(direction.equalsIgnoreCase("NW"))
				{
					dX=-1;
					dY=-1;
				}
				else if(direction.equalsIgnoreCase("NE"))
				{
					dX=1;
					dY=-1;
				}
				else if(direction.equalsIgnoreCase("SW"))
				{
					dX=-1;
					dY=1;
				}
				else if(direction.equalsIgnoreCase("SE"))
				{
					dX=1;
					dY=1;
				}
				else if(direction.equalsIgnoreCase("X"))
				{
					dX=0;
					dY=0;
					gameOver = true; 
				}
			
				//If the values do not get assigned, the program defaults to no movement.
				//The way I have direction implemented makes these situations
				//never occur as because I set dX and dY based on the user input
				//aka the user cannot enter something like -2 to move in the x
				if(dX < -1 || dX > 1) 
				{
					System.out.println(ansiRed+"That is invalid x movement."+ansiReset);
					dX = 0;
				}
				if(dY < -1 || dY > 1) 
				{
					System.out.println(ansiRed+"That is invalid y movement."+ansiReset);
					dY = 0; 
				}
				
				//Fills in where the board has already been graced by the presence
				//of the car. 
				board[playerY][playerX] = walkedPath; 
				playerX += dX;
				playerY += dY;
				
				//Checks if the player is trying to head out of bounds
				//and herds them back in like a small child. 
				if(playerX < 0) 
				{
					System.out.println(ansiRed+"You can't go there"+ansiReset);
					System.out.println(ansiRed+"Try to stay in the yard dude."+ansiReset);
					playerX = 0;
				}
				else if(playerX > boardSize - 1) 
				{
					System.out.println(ansiRed+"You can't go there"+ansiReset);
					System.out.println(ansiRed+"Try to stay in the yard dude."+ansiReset);
					playerX = boardSize - 1;
				}
				if(playerY < 0) 
				{
					System.out.println(ansiRed+"You can't go there"+ansiReset);
					System.out.println(ansiRed+"Try to stay in the yard dude."+ansiReset);
					playerY = 0;
				}
				else if(playerY > boardSize - 1) 
				{
					System.out.println(ansiRed+"You can't go there"+ansiReset);
					System.out.println(ansiRed+"Try to stay in the yard dude."+ansiReset);
					playerY = boardSize - 1; 
				}
				board[playerY][playerX] = player; 
				
				//If player makes it home, they win and round is over
				if(playerX == homeX && playerY == homeY)
				{
					System.out.println(ansiCyan+"You made it home!"+ansiReset);
					gameOver = true;
				}
				//All of these else ifs check if the player hit a pothole
				else if(playerX == pothole1X && playerY == pothole1Y)
				{
					//I added which pothole was encountered for funsies.
					//Maybe I should be Peggy Hill for Halloween (it's another arbitrary reference). 
					System.out.println(ansiYellow+"You hit pothole numero uno! Oh no--our table--it's broken! You lose!"+ansiReset);
					gameOver = true;
				}
				else if(playerX == pothole2X && playerY == pothole2Y)
				{
					//I had to ballet for skating, so have some Francais. 
					System.out.println(ansiYellow+"You hit pothole nombre deux! Oh no--our table--it's broken! You lose!"+ansiReset);
					gameOver = true;
				}
				else if(playerX == pothole3X && playerY == pothole3Y)
				{
					//Is this -- FRENCH? 
					//Also, yes esta should "tiene acento sobre la a" but I don't think 
					//Eclipse would enjoy the international keyboard very much so here we are
					//with "this broken" instead of "is broken"
					//Yes, I had a very strict Spanish teacher in high school. 
					System.out.println(ansiYellow+"You hit pothole nombre trois! Oh no--our table--esta rota! You lose!"+ansiReset);
					gameOver = true;
				}
				else if(playerX == pothole4X && playerY == pothole4Y)
				{
					System.out.println(ansiYellow+"You hit pothole numero cuatro! Oh no--our table--it's broken! You lose!"+ansiReset);
					gameOver = true;
				}
				else if(playerX == pothole5X && playerY == pothole5Y)
				{
					System.out.println(ansiYellow+"You hit pothole nombre cinq! Oh no--nuestra mesa--it's broken! You lose!"+ansiReset);
					gameOver = true;
				}
				else
				{
					//ooh another reference because why not
					//tells player they're on the right track aka they
					//haven't hit a pothole or gotten home but they're alive
					//so that's cool
					if(!(direction.equalsIgnoreCase("X")))
					{
						System.out.println("Just keep swimming...");
					}
				}
			}while(gameOver == false);
			
			System.out.println(ansiPurple+"~ROUND OVER~"+ansiPurple);
			//Play again function
			String playAgain; 
			do
			{
			System.out.println(ansiBlue+"Do you want to restart? Type 'y' or 'n'."+ansiReset);
			playAgain = keyboard.next();
			}while(!(playAgain.equalsIgnoreCase("y")||playAgain.equalsIgnoreCase("n")));
			
			if(playAgain.equalsIgnoreCase("y"))
			{
				//do while loop will iterate again
				runProgram = true;
			}
			else if(playAgain.equalsIgnoreCase("n"))
			{ 
				//do while loop will exit
				runProgram = false; 
			}
		}while(runProgram == true);
		//fun fact: this is the Italian spelling for bye
		//The Spanish informal bye would be spelled chao or chau in Argentina
		System.out.println(ansiPurple+"Shutting down...ciao!"+ansiReset);
		keyboard.close(); 
	}

}
