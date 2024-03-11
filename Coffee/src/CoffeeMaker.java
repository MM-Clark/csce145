/*
 * Written by Michelle Clark
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CoffeeMaker 
{
	final private JFrame window;
	private CoffeeCup coffeeFigure;
	private final static int marginLeft = 20, marginTop = 20;
	private static int numOfCoffee = 0;
	private static final int slotWidth = 80;
	private static final int maxNumCups = 5;
	
	public CoffeeMaker()
	{
		window = new JFrame("Coffee Maker");
		window.setSize(430,150);
		window.setLocation(20,20);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//make coffee by drawing and printing console message
	//return 1 for successful making, -1 means failing bc out of Java beans
	public int makeCoffee(CoffeeRecipe coffeeRecipe)
	{
		if(numOfCoffee>=maxNumCups)
		{
			JOptionPane.showMessageDialog(null, "Out of Java Bean!");
			return -1;
		}
		else
		{
			coffeeRecipe.printMessage();
			return makeCoffee(coffeeRecipe.getName(), coffeeRecipe.getMilkPercent());
		}
	}
	
	private int makeCoffee(String name, int milkPercent)
	{
		//Draw coffee name on top
		JLabel coffeeName = new JLabel(name);
		coffeeName.setBounds(marginLeft+numOfCoffee*slotWidth, -40, 150, 100);
		window.getContentPane().add(coffeeName);
		
		//Draw cup of coffee
		CoffeeCup coffeeFigure = new CoffeeCup(milkPercent, marginLeft + slotWidth*numOfCoffee,
		marginTop);
		window.getContentPane().add(coffeeFigure);
		
		numOfCoffee++;
		window.revalidate();
		window.repaint();
		return 1;
	}
	
	//get user input string from coffee menu
	//retun int of user input 1,2,3,4,-1 means cancel/close
	//-2 means out of range user input eg 0 or 5
	public static int getChoiceFromCoffeeMenu()
	{
		String choice;
		choice = CoffeeTimer.showCoffeeMenu();
		if(choice == null)
		{
			return -1;//cancel is clicked
		}
		return parseChoices(choice);
	}
	
	//parse user input String, handle exception, get user input as integer
	private static int parseChoices (String choice)
	{
		int task;
		try
		{
			task = Integer.parseInt(choice);
			if(task<1||task>4)
			{
				task = -2;
			}
		}
		catch(NumberFormatException e)
		{
			task = -1;
		}
		return task;
	}
}
