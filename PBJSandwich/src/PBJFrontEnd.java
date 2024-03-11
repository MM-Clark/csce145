/*
 * Written by Michelle Clark
 */
import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		boolean runProgram = true;
		
		//makes dashes
		for(int i=0; i<40;i++)
		{
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("Welcome to the PBJ Sandwich Maker!");
		
		for(int i=0; i<40;i++)
		{
			System.out.print("-");
		}
		System.out.println();
		
		//declare objects
		Bread topSlice01 = new Bread();
		PeanutButter peanutButter01 = new PeanutButter();
		Jelly jelly01 = new Jelly();
		Bread bottomSlice01 = new Bread();
		
		Bread topSlice02 = new Bread();
		PeanutButter peanutButter02 = new PeanutButter();
		Jelly jelly02 = new Jelly();
		Bread bottomSlice02 = new Bread();
		
		PBJSandwich sandwich01 = new PBJSandwich();
		PBJSandwich sandwich02= new PBJSandwich();
		
		int topSlice01Calories = 50;
		String topSlice01Type = "whole grain";
		int bottomSlice01Calories = 50;
		
		do
		{
			//S1
			System.out.println("-----Sandwich 1-----");
			
			//TS 1
			System.out.println("Top slice of bread information");
			
			System.out.println("Enter name of bread: ");
			String topSlice01Name = keyboard.nextLine();
			topSlice01.setName(topSlice01Name);
			
			System.out.println("Enter number of calories (50-250): ");
			String topSlice01CaloriesString = keyboard.nextLine();//error location
			topSlice01Calories = Integer.parseInt(topSlice01CaloriesString);
			topSlice01.setCalories(topSlice01Calories);
			
			System.out.println("Enter type of bread (honey wheat, white, whole grain, or whole wheat): ");
			topSlice01Type = keyboard.nextLine();
			topSlice01.setType(topSlice01Type);
			
			//PB 1
			System.out.println("Peanut Butter Information: ");
			
			System.out.println("Enter name of peanut butter: ");
			String peanutButter01Name = keyboard.nextLine();
			peanutButter01.setName(peanutButter01Name);
			
			System.out.println("Enter number of calories(100-300): ");
			String peanutButter01CaloriesString = keyboard.nextLine();
			int peanutButter01Calories = Integer.parseInt(peanutButter01CaloriesString);
			peanutButter01.setCalories(peanutButter01Calories);
			
			System.out.println("Is it crunchy? Enter 'true' or 'false'.");
			String peanutButter01IsCrunchyString = keyboard.nextLine();
			boolean peanutButter01IsCrunchy=false;
			if(peanutButter01IsCrunchyString.equalsIgnoreCase("true")||peanutButter01IsCrunchyString.equalsIgnoreCase("false"))
			{
				if(peanutButter01IsCrunchyString.equalsIgnoreCase("true"))
				{
					peanutButter01IsCrunchy = true;
				}
				else if(peanutButter01IsCrunchyString.equalsIgnoreCase("false"))
				{
					peanutButter01IsCrunchy = false;
				}
			}
			else
			{
				throw new IllegalArgumentException("Peanut butter crunchiness must be true or false!");
			}
			peanutButter01.setIsCrunchy(peanutButter01IsCrunchy);
			
			System.out.println("Jelly Information");
			
			System.out.println("Enter name of the jelly");
			String jelly01Name = keyboard.nextLine();
			jelly01.setName(jelly01Name);
			
			System.out.println("Enter the number of calories (50-200)");
			String jelly01CaloriesString = keyboard.nextLine();
			int jelly01Calories = Integer.parseInt(jelly01CaloriesString);
			
			jelly01.setCalories(jelly01Calories);
			
			System.out.println("Enter the type of jelly. Must be 'Apple','Blueberry', 'Grape', 'Strawberry', or 'Tomato'.");
			String jelly01Type = keyboard.nextLine();
			jelly01.setType(jelly01Type);
			
			//Bottom Slice 01
			System.out.println("Bottom slice of bread information");
			
			System.out.println("Enter name of the bread");
			String bottomSlice01Name = keyboard.nextLine();
			bottomSlice01.setName(bottomSlice01Name);
			
			System.out.println("Enter number of calories (50-250): ");
			String bottomSlice01CaloriesString = keyboard.nextLine();
			bottomSlice01Calories = Integer.parseInt(bottomSlice01CaloriesString);
			bottomSlice01.setCalories(bottomSlice01Calories);
			
			System.out.println("Enter type of bread (honey wheat, white, whole grain, or whole wheat): ");
			String bottomSlice01Type = keyboard.nextLine();
			bottomSlice01.setType(bottomSlice01Type);
			
			//SET SANDWICH 1
			sandwich01.setBottomSlice(bottomSlice01);
			sandwich01.setJelly(jelly01);
			sandwich01.setPeanutButter(peanutButter01);
			sandwich01.setTopSlice(topSlice01);
			
			//S2
			System.out.println("-----Sandwich 2-----");
			
			//TS 2
			System.out.println("Top slice of bread information");
			
			System.out.println("Enter name of bread: ");
			String topSlice02Name = keyboard.nextLine();
			topSlice02.setName(topSlice02Name);
			
			System.out.println("Enter number of calories (50-250): ");
			String topSlice02CaloriesString = keyboard.nextLine();
			int topSlice02Calories = Integer.parseInt(topSlice02CaloriesString);
			topSlice02.setCalories(topSlice02Calories);
			
			System.out.println("Enter type of bread (honey wheat, white, whole grain, or whole wheat): ");
			String topSlice02Type = keyboard.nextLine();
			topSlice02.setType(topSlice02Type);
			
			//PB 1
			System.out.println("Peanut Butter Information: ");
			
			System.out.println("Enter name of peanut butter: ");
			String peanutButter02Name = keyboard.nextLine();
			peanutButter02.setName(peanutButter02Name);
			
			System.out.println("Enter number of calories(100-300): ");
			String peanutButter02CaloriesString = keyboard.nextLine();
			int peanutButter02Calories = Integer.parseInt(peanutButter02CaloriesString);
			peanutButter02.setCalories(peanutButter02Calories);
			
			System.out.println("Is it crunchy? Enter 'true' or 'false'.");
			String peanutButter02IsCrunchyString = keyboard.nextLine();
			boolean peanutButter02IsCrunchy=false;
			if(peanutButter02IsCrunchyString.equalsIgnoreCase("true")||peanutButter02IsCrunchyString.equalsIgnoreCase("false"))
			{
				if(peanutButter02IsCrunchyString.equalsIgnoreCase("true"))
				{
					peanutButter02IsCrunchy = true;
				}
				else if(peanutButter02IsCrunchyString.equalsIgnoreCase("false"))
				{
					peanutButter02IsCrunchy = false;
				}
			}
			else
			{
				throw new IllegalArgumentException("Peanut butter crunchiness must be true or false!");
			}
			peanutButter02.setIsCrunchy(peanutButter02IsCrunchy);
			
			System.out.println("Jelly Information");
			
			System.out.println("Enter name of the jelly");
			String jelly02Name = keyboard.nextLine();
			jelly02.setName(jelly02Name);
			
			System.out.println("Enter the number of calories (50-200)");
			String jelly02CaloriesString = keyboard.nextLine();
			int jelly02Calories = Integer.parseInt(jelly02CaloriesString);
			jelly02.setCalories(jelly02Calories);
			
			System.out.println("Enter the type of jelly. Must be 'Apple','Blueberry', 'Grape', 'Strawberry', or 'Tomato'.");
			String jelly02Type = keyboard.nextLine();
			jelly02.setType(jelly02Type);
			
			//Bottom Slice 01
			System.out.println("Bottom slice of bread information");
			
			System.out.println("Enter name of the bread");
			String bottomSlice02Name = keyboard.nextLine();
			bottomSlice02.setName(bottomSlice02Name);
			
			System.out.println("Enter number of calories (50-250): ");
			String bottomSlice02CaloriesString = keyboard.nextLine();
			int bottomSlice02Calories = Integer.parseInt(bottomSlice02CaloriesString);
			bottomSlice02.setCalories(bottomSlice02Calories);
			
			System.out.println("Enter type of bread (honey wheat, white, whole grain, or whole wheat): ");
			String bottomSlice02Type = keyboard.nextLine();
			bottomSlice02.setType(bottomSlice02Type);
			
			//SET SANDWICH 2
			sandwich02.setBottomSlice(bottomSlice02);
			sandwich02.setJelly(jelly02);
			sandwich02.setPeanutButter(peanutButter02);
			sandwich02.setTopSlice(topSlice02);
			
			//PRINT SANDWICHES
			System.out.println("-----Sandwich 01-----");
			System.out.println("PBJ Sandwich");
			System.out.println(sandwich01.toString());
			System.out.println();
			
			System.out.println("-----Sandwich 02-----");
			System.out.println("PBJ Sandwich");
			System.out.println(sandwich02.toString());
			System.out.println();
			
			System.out.println("Are they the same sandwich?");
			System.out.print("  "+sandwich01.equals(sandwich02));
			System.out.println();
			
			//RESTART OR QUIT
			System.out.println("Would you like to restart or quit?");
			String restartString;
			do 
			{
				System.out.println("Press [ENTER] to restart or type 'quit' to quit");
				restartString = keyboard.nextLine();
			}while(!(restartString.equals("")||restartString.equalsIgnoreCase("quit")));
			
			if(restartString.equals(""))
			{
				runProgram = true;
			}
			else if(restartString.equalsIgnoreCase("quit"))
			{
				runProgram = false;
			}
			
		}while(runProgram == true);
		System.out.println("Shutting down");
		keyboard.close();
	}

}
