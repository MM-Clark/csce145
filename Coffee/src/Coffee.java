/*
 * Written by Michelle Clark
 */

public class Coffee {

	//declarations
	private String name;
	private double caffeineContent;
	
	//default constructor
	public Coffee()
	{
		this.name = "none";
		this.caffeineContent = 50.0;
	}
	
	public Coffee(String name, double caffeineContent)
	{
		this.setName(name);
		this.setCaffeineContent(caffeineContent);
	}
	
	//getters, setters for name
	public String getName() 
	{
		return this.name;
	}
		
	public void setName(String name) 
	{
		this.name = name;
	}
	
	//for caffeineContent
	public double getCaffeineContent()
	{
		return this.caffeineContent;
	}
	
	public void setCaffeineContent(double caffeineContent)
	{
		this.caffeineContent = caffeineContent;
	}
	
	//toString method
	//prints out coffee name and caffeineContent for instance variable 
	public String toString()
	{
		return "Coffee Name: "+this.name+"\nCaffeine Amount: "+this.caffeineContent;
	}
	
	//equals method, returns true if this coffee is equal to other coffee, false otherwise
	//compares parameters to determine
	public boolean equals(Coffee other)
	{
		return (this.getName().equals(other.getName()))&& 
		(this.getCaffeineContent()==other.getCaffeineContent());
	}
	
	//riskyAmount method
	public double riskyAmount()
	{
		double caffeineContentTemp = this.caffeineContent;
		double riskyCupAmount = 180.0/((caffeineContentTemp/100.0)*6.0);
		
		return riskyCupAmount; 
	}
}
