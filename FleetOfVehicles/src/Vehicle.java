/*
 * Written by Michelle Clark
 */
public class Vehicle 
{
	//this is the superclass
	private String manufacturerName;
	private int numberOfCylinders;
	private String ownerName;
	
	//setting default values
	public Vehicle()
	{
		this.manufacturerName = "none";
		this.numberOfCylinders = 6;
		this.ownerName = "none";
	}
	
	public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName)
	{
		this.setManufacturerName(manufacturerName);
		this.setNumberOfCylinders(numberOfCylinders);
		this.setOwnerName(ownerName);
	}
	
	public String getManufacturerName()
	{
		return this.manufacturerName;
	}
	
	public void setManufacturerName(String manufacturerName)
	{
		//checks if manufacturer name is a null String, if not we set to user input
		//if so we set to the default value
		if(manufacturerName != null)
		{
			this.manufacturerName = manufacturerName;
		}
		else
		{
			this.manufacturerName = "none";
		}
	}
	
	public int getNumberOfCylinders()
	{
		return this.numberOfCylinders;
	}
	
	public void setNumberOfCylinders(int numberOfCylinders)
	{
		if(numberOfCylinders > 0)
		{
			this.numberOfCylinders = numberOfCylinders;
		}
		else
		{
			this.numberOfCylinders = 6;
		}
	}
	
	public String getOwnerName()
	{
		return this.ownerName;
	}
	
	public void setOwnerName(String ownerName)
	{
		if(ownerName != null)
		{
			this.ownerName = ownerName;
		}
		else
		{
			this.ownerName = "none";
		}
	}
	
	//to String method
	public String toString()
	{
		return "Manufacturer's name: "+this.manufacturerName+"\nNumber of Cylinders: "+
				this.numberOfCylinders+"\nOwner's name: "+this.ownerName;
	}
	
	//equals method
	public boolean equals(Vehicle other)
	{
		//note how .equals is used to compare the contents of strings, while ==
		//is used to compare primitives like ints
		return(this.getManufacturerName().equalsIgnoreCase(other.getManufacturerName())&&
				(this.getNumberOfCylinders() == other.getNumberOfCylinders()) && 
				(this.getOwnerName().equalsIgnoreCase(other.getOwnerName())));
	}
}
