/*
 * Written by Michelle Clark
 */
public class Car extends Vehicle 
{
	private double gasMileage;
	private int numberOfPassengers;
	
	public Car() 
	{
		super();//default constructor for vehicle class
		this.gasMileage = 1.0;
		this.numberOfPassengers = 1;
	}

	public Car(String manufacturerName, int numberOfCylinders, String ownerName,
			double gasMileage, int numberOfPassengers) 
	{
		//inherits these from the superclass
		super(manufacturerName, numberOfCylinders, ownerName);
		//sets these to additional inputs
		this.setGasMileage(gasMileage);
		this.setNumberOfPassengers(numberOfPassengers);
	}
	
	//getter and setter methods
	public double getGasMileage()
	{
		return this.gasMileage;
	}
		
	public void setGasMileage(double gasMileage)
	{
		if(gasMileage>=0)
		{
			this.gasMileage = gasMileage;
		}
		else
		{
			this.gasMileage = 1.0;
		}
	}
		
	public int getNumberOfPassengers()
	{
		return this.numberOfPassengers;
	}
		
	public void setNumberOfPassengers(int numberOfPassengers)
	{
		//if number of Passengers is a positive decimal number, it will set to user input
		//otherwise it sets to default value
		if(numberOfPassengers>=0)
		{
			this.numberOfPassengers = numberOfPassengers;
		}
		else
		{
			this.numberOfPassengers = 1;
		}
	}
		
	//toString and equals methods 
	//to String method
	public String toString()
	{
		return super.toString()+"\nGas Mileage: "+this.gasMileage
			+"\nNumber of Passengers: "+this.numberOfPassengers;
	}
			
	//equals method
	public boolean equals(Car other)
	{
		return(super.equals(other))&&
			(this.getGasMileage() == other.getGasMileage()) && 
			(this.getNumberOfPassengers()==other.getNumberOfPassengers());
	}
}
