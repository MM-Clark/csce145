/*
 * Written by M.M.Clark
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class CoffeeCup extends JComponent
{
	private final int cupWidth = 50, cupHeight = 75;
	private int startX, startY;
	private int milkPercentage = 100;
	
	CoffeeCup(int milkPercentage, int startX, int startY)
	{
		this.milkPercentage = milkPercentage;
		this.startX = startX;
		this.startY = startY;
	}
	
	@Override 
	public void paint(Graphics g)
	{
		int x = startX;
		int cupThickness = 5, gap = 2;
		
		//draw cup
		g.setColor(Color.lightGray);
		g.fillRect(x-cupThickness, startY, cupWidth+cupThickness*2, cupHeight+cupThickness);
		g.setColor(this.getBackground());
		g.fillRect(x-gap, startY, cupWidth*2, cupHeight+gap);
		
		//draw milk
		int milkHeight = (int)(cupHeight*milkPercentage/100.0);
		g.setColor(Color.white);
		g.fillRect(x, startY, cupWidth, milkHeight);
		
		//draw espresso
		int coffeeHeight = cupHeight - milkHeight;
		g.setColor(new Color(100,50,0));//coffee brown color
		g.fillRect(x, startY+milkHeight, cupWidth, coffeeHeight);
		
	}
}
