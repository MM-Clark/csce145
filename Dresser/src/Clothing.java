/*
 * Written by Michelle Clark
 */
public class Clothing 
{
	private String type;
	private String color;
	
	public Clothing()
	{
		//setting default values
		this.type = "Socks";
		this.color = "Black";
	}
	
	public String getType()
	{
		return this.type;
	}
	
	//if type is a valid string, sets; otherwise goes to default
	public void setType(String type)
	{
		if(type.equalsIgnoreCase("Undergarment")||type.equalsIgnoreCase("Socks")||
				type.equalsIgnoreCase("Stockings")||type.equalsIgnoreCase("Top")||
				type.equalsIgnoreCase("Bottom")||type.equalsIgnoreCase("Cape"))
		{
			this.type = type;
		}
		else
		{
			this.type = "Socks";
		}
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	//if type is a valid string, sets; otherwise goes to default
	public void setColor(String color)
	{
		//checks for color validity otherwise sets default color
		if(color.equalsIgnoreCase("Brown")||color.equalsIgnoreCase("Red")||
				color.equalsIgnoreCase("Pink")||color.equalsIgnoreCase("Black")||
				color.equalsIgnoreCase("White")||color.equalsIgnoreCase("Orange")||
				color.equalsIgnoreCase("Green")||color.equalsIgnoreCase("Blue")||
				color.equalsIgnoreCase("Purple")||color.equalsIgnoreCase("Grey"))
		{
			this.color = color;
		}
		else
		{
			this.color = "Black";
		}
	}
	//to String method
	public String toString()
	{
		return "[Clothing] Type: "+this.type+" Color: "+this.color;
	}
	//equals method
	public boolean equals(Clothing other)
	{
		return(this.getType().equalsIgnoreCase(other.getType())&&
				this.getColor().equalsIgnoreCase(other.getColor()));
	}
}
