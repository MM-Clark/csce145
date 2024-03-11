/*
 * Written by Michelle Clark
 */
//I don't actually use this thing oops
import javax.swing.JOptionPane;
import java.util.Random;

public class CoffeeTimer 
{
	private static String[] coffeeNames;
	private static int[] coffeeMilkPercents;
	private static CoffeeMaker coffeeMaker;
	
	//show menu of choices and get user input NOT USED HERE BUT I COULD
	//there are many ways to implement things
	public static String showCoffeeMenu()
	{
		return JOptionPane.showInputDialog("Coffee menu: Black, Brown, White");
	}
	
	public static int showMilkPercents()
	{
		String milkPercentString=
		JOptionPane.showInputDialog("Milk percents: 0-20");	
		
		int milkPercent = Integer.parseInt(milkPercentString);
		return milkPercent;
	}
}
