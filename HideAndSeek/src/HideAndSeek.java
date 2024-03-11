/*
 * Written by M.M. Clark.
 */
//This is from the multidimensional arrays slides demo. 
//user input
import java.util.Scanner;
//to use type random 
import java.util.Random;

public class HideAndSeek 
{
	public static final int boardSize = 10;
	//distance equation
	public static final int coldDist =(boardSize/2)*(boardSize/2);
	public static final int warmDist = (boardSize/4)*(boardSize/4);
	
	//2D array of chars
	public static final char empty = '_';
	public static final char player = 'X';
	public static final char walkedPath = '#';
	//sep for debugging; _ so player can't figure out
	public static final char goal = '_';
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		//keeping track of player position
		int pX = 0;
		int pY = 0;
		
		int gX = r.nextInt(boardSize);
		int gY = r.nextInt(boardSize);
		
		char[][] board = new char[boardSize][boardSize];
		
		for(int i=0;i<board.length;i++) 
		{
			//you have to use board[i].length to avoid logic error!
			for(int j=0;j<board[i].length;j++) 
			{
				board[i][j] = empty; 
			}
		}
		//i corresponds to the vertical part
		board[pY][pX] = player; 
		board[gY][gX] = goal; 
		
		System.out.println("Welcome to hide and seek!");
		boolean gameOver = false; 
		while(!gameOver) 
		{
			//show the board
			for(int i=0;i<board.length;i++) 
			{
				for(int j=0;j<board[i].length;j++) 
				{
					//don't skip lines!
					System.out.print(board[i][j]);
				}
				System.out.println(); 
			}
			//assuming distances are sqared to avoid sqare roots
			int distance = (pX-gX)*(pX-gX)+(pY-gY)*(pY-gY);
			
			if(distance > coldDist) 
			{
				System.out.println("You are getting colder.");
			}
			else if(distance > warmDist) 
			{
				System.out.println("You are getting warmer.");
			}
			else 
			{
				System.out.println("You are getting hotter!");
			}
			
			//user input
			System.out.println("Enter either -1, 0, or 1 to move in the x.");
			int dX = keyboard.nextInt();
			System.out.println("Enter either -1, 0, or 1 to move in the y.");
			int dY = keyboard.nextInt();
			
			//should be independently checked
			if(dX < -1 || dX > 1) 
			{
				System.out.println("That is an invalid x.");
				dX = 0;
			}
			if(dY < -1 || dY > 1) 
			{
				System.out.println("That is an invalid y.");
				dY = 0; 
			}
			
			board[pY][pX] = walkedPath; 
			pX += dX;
			pY += dY;
			
			//checking if still on board
			if(pX < 0) 
			{
				pX = 0;
			}
			else if(pX > boardSize - 1) 
			{
				pX = boardSize - 1;
			}
			if(pY < 0) 
			{
				pY = 0;
			}
			else if(pY > boardSize - 1) 
			{
				pY = boardSize - 1; 
			}
			board[pY][pX] = player; 
			if(pX == gX && pY == gY) 
			{
				System.out.println("You win!");
				gameOver = true;
			}
		}
		keyboard.close(); 
	}
}
