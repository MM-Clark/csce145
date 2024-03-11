/*
 * Written by Michelle Clark
 */
import java.util.Random;

public class CoffeeRecipe 
{
	private String name = " ";
	private int milkPercent;
	
	private static int specialRecipeCounter = 0;
	
	CoffeeRecipe()
	{
		this.name = "Milk";
		this.milkPercent = 50;
	}
	
	public CoffeeRecipe(String name, int milkPercent)
	{
		this.name = name;
		this.milkPercent = milkPercent;
	}
	
	private static String getSpecialRecipeSuffix()
	{
		specialRecipeCounter++;
		return String.valueOf((char)(specialRecipeCounter+'A'));
	}
	
	private static int genRandomMilkPercent()
	{
		Random random = new Random();
		return random.nextInt(100);
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMilkPercent()
	{
		return milkPercent;
	}
	
	public void printMessage()
	{
		System.out.println(name+" has a "+milkPercent+":"+(100 - milkPercent)+ " milk to espresso ratio.");
	}
}
