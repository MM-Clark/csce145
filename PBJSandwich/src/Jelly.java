/*
 * Written by Michelle Clark
 */
public class Jelly 
{
	private String name;
	private int calories;
	private String fruitType;
	
	public Jelly()
	{
		this.name = "none";
		this.calories = 50;
		//note that grape jelly is disgusting and blueberry is superior
		this.fruitType = "Grape";
	}
	
	//getters & setters
		public String getName()
		{
			return this.name;
		}
			
		public void setName(String name)
		{
			//only sets if name is not a null string
			if(name != null)
			{
				this.name = name;
			}
			//null pointer exception for null string
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
			if(calories>=50 && calories <= 200)
			{
				this.calories = calories;
			}
			//index out of bounds exception for if the index/integer is out of range
			else if(calories<50 || calories > 200)
			{
				throw new IndexOutOfBoundsException("Calories must be an integer value between 50 and 200 inclusively!");
			}
		}
		
		public String getFruitType()
		{
			return this.fruitType;
		}
		
		public void setType(String fruitType)
		{
			if(fruitType.equalsIgnoreCase("apple")||fruitType.equalsIgnoreCase("blackberry")||fruitType.equalsIgnoreCase("grape")||fruitType.equalsIgnoreCase("blueberry")||fruitType.equalsIgnoreCase("tomato"))
			{
				this.fruitType = fruitType;
			}
			//if type is a non-null value outside of the accepted values we throw a string index
			//out of bounds exception
			else if(fruitType != null)
			{
				throw new StringIndexOutOfBoundsException("Fruit type must be apple, blackberry, grape, blueberry, or tomato!");
			}
			else
			{
				//if type is null value we throw null pointer exception
				throw new NullPointerException("Fruit type cannot be null!");
			}
		}
		
		//toString method
		public String toString() 
		{
			return "Name: "+this.name+"\nCalories: "+this.calories+"\nFruit Type: "+this.fruitType;
		}
			
		//for comparison
		public boolean equals(Jelly other) 
		{
			return (this.getName().equalsIgnoreCase(other.getName()))&&
			(this.getCalories()==other.getCalories())&&
			(this.getFruitType().equalsIgnoreCase(other.getFruitType()));
		}
}
