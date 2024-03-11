/*
 * Written by Michelle Clark
 */
public class PBJSandwich 
{
	private Bread topSlice;
	private PeanutButter peanutButter;
	private Jelly jelly;
	private Bread bottomSlice;
	
	public PBJSandwich()
	{
		this.topSlice = new Bread();
		this.peanutButter = new PeanutButter();
		this.jelly = new Jelly();
		this.bottomSlice = new Bread();
	}
	
	public PBJSandwich(Bread topSlice, PeanutButter peanutButter, Jelly jelly, Bread bottomSlice)
	{
		this.setTopSlice(topSlice);
		this.setPeanutButter(peanutButter);
		this.setJelly(jelly);
		this.setBottomSlice(bottomSlice);
	}
	
	public Bread getTopSlice()
	{
		return this.topSlice; 
	}
	
	public void setTopSlice(Bread topSlice)
	{
		this.topSlice = topSlice;
	}
	
	public PeanutButter getPeanutButter()
	{
		return this.peanutButter;
	}
	
	public void setPeanutButter(PeanutButter peanutButter)
	{
		this.peanutButter = peanutButter;
	}
	
	public Jelly getJelly()
	{
		return this.jelly;
	}
	
	public void setJelly(Jelly jelly)
	{
		this.jelly = jelly;
	}
	
	public Bread getBottomSlice()
	{
		return this.bottomSlice;
	}
	
	public void setBottomSlice(Bread bottomSlice)
	{
		this.bottomSlice = bottomSlice;
	}
	
	//toString method
	public String toString() 
	{
		// \n is used for new line
		return "Top Slice: \n"+"Bread \n"+topSlice.toString()+"\nPeanut Butter: \n"+peanutButter.toString()+"\nJelly: \n"+jelly.toString()+"\nBottom slice: \n"+"Bread \n"+bottomSlice.toString();
	}
			
	//for comparison uses .equals methods from other classes and boolean comparisons to determine equality
	public boolean equals(PBJSandwich other) 
	{
		return (this.getTopSlice().equals(other.getTopSlice()))&&
		(this.getPeanutButter().equals(other.getPeanutButter()))&&
		(this.getJelly().equals(other.getJelly()))&&(this.getBottomSlice().equals(other.getBottomSlice()));
	}
}
