/*
 * Written by Michelle Clark
 */
//Sorry for all of the windows; wanted to do the creative UI thing
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.util.Random;

public class CoffeeTester extends JPanel
{
	
	public CoffeeTester()
	{
		
		String[] columnNames = {"Display coffee info: ", 
				"Determine dangerous consumption in hour", 
				"Determine equality"};
				
		Object[][] data = 
		{
		{"Presented first", "Presented second", "Presented third"}
		};
		
		final JTable table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane);
	}
	
	private static void createAndShowGUI() 
	{
		//create and set up window
		JFrame frame = new JFrame("SimpleTableDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create and set up the content pane
		CoffeeTester newContentPane = new CoffeeTester();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		
		//display window
		frame.pack();
		frame.setVisible(true);
	}
	
	private static int genRandomMilkPercent()
	{
		Random random = new Random();
		return random.nextInt(40);
	}
	
	private static int genRandomLevelPercent()
	{
		Random random = new Random();
		return random.nextInt(20);
	}
	
	public static void printCups(String coffee1Info, String coffee2Info)
	{
		JOptionPane.showMessageDialog(null, "Coffee 1 info: " + coffee1Info);
		JOptionPane.showMessageDialog(null, "Coffee 2 info: " + coffee2Info);
	}
	
	public static void cupsConsumedHealthRisk(double riskyAmount1, double riskyAmount2)
	{
		JOptionPane.showMessageDialog(null, "Number of cups that if consumed in an hour would equal issues for your health: "
				+ "\nCoffee 1: " + riskyAmount1
				+ "\nCoffee 2: " + riskyAmount2);
	}
	
	public static void areEqualCups(boolean equalCups)
	{
		//true case
		if(equalCups==true)
		{
			JOptionPane.showMessageDialog(null, "Las tazas son las mismas");
		}
	
		//false case
		else if(equalCups==false)
		{
			JOptionPane.showMessageDialog(null, "Las tazas NO son las mismas");
		}
	}
	
	public static void main(String[] args) {
		
		//Hah, no scanner keyboards for I
		
		//Setting up instances
		Coffee coffee01 = new Coffee();
		Coffee coffee02 = new Coffee();
		
		//setting up vars
		String nameInput1;
		String caffeineContent1;
		String nameInput2;
		String caffeineContent2;
		
		String coffee1Info;
		String coffee2Info;
		
		String restart; 
		
		double caffeineContentInput2;
		double riskyAmount1;
		double riskyAmount2;
		
		//for a thing at the end 
		int milkLevel;
		
		boolean equalCups;
		
		boolean runProgram = true;
		
		do
		{
			//Welcomes user using JOption pane for UI
			JOptionPane.showMessageDialog(null,"Bienvenidos a la hora de cafe '-'");
		
			//Prompting for first name input, no we're not using accentos hoy
			//or pregunta marks -- yes it's spanglish time
			nameInput1 =
			JOptionPane.showInputDialog("Y el nombre del primer cafe?");
		
			//Prompting for caffeine content for first coffee
			caffeineContent1 =
			JOptionPane.showInputDialog("Y su contenido en cafeina?");
		
			//try catch time for String validity
			try
			{
				double isNumericalVal = Double.parseDouble(caffeineContent1);
			}
			catch(NumberFormatException e)
			{
				throw new NumberFormatException(caffeineContent1 + " is not a numerical value"); 
			}
			catch(NullPointerException e)
			{
				throw new NullPointerException(caffeineContent1+ " is a null input");
			}
		
			Double caffeineContentInput1 = Double.parseDouble(caffeineContent1);
			if(caffeineContentInput1 < 50.0 || caffeineContentInput1 > 300.0)
			{
				throw new IndexOutOfBoundsException(caffeineContentInput1 + " is outside of the acceptable 50-350 mg range!");
			}
		
			//setting stuff from validated user input
			coffee01.setName(nameInput1);
			coffee01.setCaffeineContent(caffeineContentInput1);
		
			//time for the second cuppp
			nameInput2 =
			JOptionPane.showInputDialog("Y el nombre del otro cafe?");
				
			//Prompting for caffeine content for first coffee
			caffeineContent2 =
					JOptionPane.showInputDialog("Y su contenido en cafeina?");
				
			//seeing if this string is even not null or numerical 
			//also throwing exceptions for either scenario
			try
			{
				//I can redeclare this double because it doesn't exist outside of the
				//try catch 
				double isNumericalVal = Double.parseDouble(caffeineContent2);
			}
			catch(NumberFormatException e)
			{
				throw new NumberFormatException(caffeineContent2 + " is not a numerical value"); 
			}
			catch(NullPointerException e)
			{
				throw new NullPointerException(caffeineContent2 + " is a null input");
			}
				
			caffeineContentInput2 = Double.parseDouble(caffeineContent2);
			if(caffeineContentInput2 < 50.0 || caffeineContentInput2 > 300.0)
			{
				throw new IndexOutOfBoundsException(caffeineContentInput2 + " is outside of the acceptable 50-350 mg range!");
			}
			
			//setting for coffee 2
			coffee02.setName(nameInput2);
			coffee02.setCaffeineContent(caffeineContentInput2);
		
			//ooh table time
			createAndShowGUI();
		
			//Print to string properties
			//.tostring call method in coffee class to print to string for this instance
			//of coffee class
			coffee1Info = coffee01.toString();
			coffee2Info = coffee02.toString();
			printCups(coffee1Info, coffee2Info);
		
			//Print out how many cups in an hour would be a health risk
			riskyAmount1 = coffee01.riskyAmount();
			riskyAmount2 = coffee02.riskyAmount();
			
			cupsConsumedHealthRisk(riskyAmount1, riskyAmount2);
		
			//comparing for equality
			JOptionPane.showMessageDialog(null, "Las tazas son las mismas o no?");
		
			equalCups = coffee01.equals(coffee02);
			areEqualCups(equalCups);
			
			//restart function
			restart =
			JOptionPane.showInputDialog("Start program again? Enter y/n.");
			
			while(!(restart.equalsIgnoreCase("y")||restart.equalsIgnoreCase("n")))
			{
				restart =
				JOptionPane.showInputDialog("Enter y or n.");
			}
			
			if(restart.equalsIgnoreCase("y"))
			{
				runProgram = true;
			}
			else if(restart.equalsIgnoreCase("n"))
			{
				runProgram = false;
			}
			else
			{
				System.out.println("oh no");
			}
			
		}while(runProgram == true);
		
		//fun thing to print cups of coffee w/random milk percents using JFrame/JPanel
		//No I'm not using this the way the original assigner/poster intended
		//oh well
		milkLevel = genRandomMilkPercent(); 
		
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		
		for(int i = 0; i < 4; i++)
		{
			//creating coffee classes instances 
			CoffeeRecipe coffee = new CoffeeRecipe("Milk", milkLevel);
			//calling method to make coffee
			coffeeMaker.makeCoffee(coffee);
			//milk level addition is from another method
			milkLevel+= genRandomLevelPercent();
		}
		
		JOptionPane.showMessageDialog(null, "dun dun");
		JOptionPane.showMessageDialog(null, "ok bye");
		
		System.exit(0);
		
	}

}
