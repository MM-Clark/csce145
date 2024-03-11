/*
 * Written by Michelle Clark
 */
public class Bread 
{
	//declarations
	private String name;
	private int calories;
	private String type;
	
	//default settings
	public Bread()
	{
		this.name = "none";
		this.calories = 50;
		this.type = "Whole Grain";
	}
	
	//getters & setters
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		if(name != null)
		{
			this.name = name;
		}
		else 
		{
			throw new NullPointerException("Name cannot be a null string!");
		}
	}
	
	public int getCalories()
	{
		return this.calories;
	}
	
	public void setCalories(int calories)
	{
		if(calories>=50 && calories <= 250)
		{
			this.calories = calories;
		}
		else 
		{
			throw new IndexOutOfBoundsException("Calories must be an integer value between 50 and 250 inclusively!");
		}
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setType(String type)
	{
		if(type.equalsIgnoreCase("honey wheat")||type.equalsIgnoreCase("white")||type.equalsIgnoreCase("whole grain")||type.equalsIgnoreCase("whole wheat"))
		{
			this.type = type;
		}
		//if type is a non-null value outside of the accepted values we throw a string index
		//out of bounds exception
		else if(type != null)
		{
			throw new StringIndexOutOfBoundsException("Type must be honey wheat, white, whole grain, or whole wheat!");
		}
		else
		{
			throw new NullPointerException("Type cannot be null!");
		}
	}
	
	//toString method
	public String toString() 
	{
		return "Name: "+this.name+"\nCalories: "+this.calories+"\nType: "+this.type;
	}
	//for comparison
	public boolean equals(Bread other) 
	{
		return (this.getName().equalsIgnoreCase(other.getName()))&&
		(this.getCalories()==other.getCalories())&&
		(this.getType().equalsIgnoreCase(other.getType()));
	}
}
