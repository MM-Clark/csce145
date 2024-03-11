/*
 * Written by Michelle Clark
 */
public class PeanutButter 
{
	private String name;
	private int calories;
	private boolean isCrunchy;
	
	public PeanutButter()
	{
		this.name = "none";
		this.calories = 100;
		this.isCrunchy = false;
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
		else if(name == null)
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
		if(calories>=100 && calories <= 300)
		{
			this.calories = calories;
		}
		else if(calories<100 || calories > 300)
		{
			throw new IndexOutOfBoundsException("Calories must be an integer value between 100 and 300 inclusively!");
		}
	}
		
	public boolean getIsCrunchy()
	{
		return this.isCrunchy;
	}
		
	public void setIsCrunchy(boolean isCrunchy)
	{
		//front end creates an exception if the string value entered is not true or false so I don't have one here
		this.isCrunchy = isCrunchy; 
	}
		
	//toString method
	public String toString() 
	{
		return "Name: "+this.name+"\nCalories: "+this.calories+"\nIs Crunchy: "+this.isCrunchy;
	}
		
	//for comparison
	public boolean equals(PeanutButter other) 
	{
		return (this.getName().equalsIgnoreCase(other.getName()))&&
		(this.getCalories()==other.getCalories())&&
		(this.getIsCrunchy()==other.getIsCrunchy());
	}

}
