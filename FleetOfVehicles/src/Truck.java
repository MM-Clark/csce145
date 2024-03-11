/*
 * Written by Michelle Clark
 */
//truck's superclass is vehicle
public class Truck extends Vehicle 
{
	private double loadCapacity; 
	private double towingCapacity; 
	
	public Truck() 
	{
		super(); //vehicle's default constructor
		this.loadCapacity = 1.0; //default load cap
		this.towingCapacity = 1.0; //default towing cap
	}
	
	public Truck(String manufacturerName, int numberOfCylinders, String ownerName, 
			double loadCapacity, double towingCapacity)
	{
		//inheriting the values of vehicle
		super(manufacturerName, numberOfCylinders, ownerName);
		//setting the other values
		this.setLoadCapacity(loadCapacity);
		this.setTowingCapacity(towingCapacity);
	}
	
	//getter and setter methods
	public double getLoadCapacity()
	{
		return this.loadCapacity;
	}
	
	public void setLoadCapacity(double loadCapacity)
	{
		//if load capacity is positive decimal, sets to user input; otherwise default
		if(loadCapacity>=0)
		{
			this.loadCapacity = loadCapacity;
		}
		else
		{
			this.loadCapacity = 1.0;
		}
	}
	
	public double getTowingCapacity()
	{
		return this.towingCapacity;
	}
	
	public void setTowingCapacity(double towingCapacity)
	{
		//if load capacity is a positive decimal number, it will set to user input
		//otherwise it sets to default value
		if(loadCapacity>=0)
		{
			this.towingCapacity = towingCapacity;
		}
		else
		{
			this.towingCapacity = 1.0;
		}
	}
	
	//toString and equals methods 
	//to String method
	public String toString()
	{
		return super.toString()+"\nTowing Capacity: "+this.towingCapacity
				+"\nLoad Capacity: "+this.loadCapacity;
	}
		
	//equals method
	public boolean equals(Truck other)
	{
		return(super.equals(other))&&
				(this.getLoadCapacity() == other.getLoadCapacity()) && 
				(this.getTowingCapacity()==other.getTowingCapacity());
	}
}
