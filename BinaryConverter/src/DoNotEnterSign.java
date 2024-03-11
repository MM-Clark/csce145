/*
 * Written by M.M.Clark
 */
//THIS IS A PURPOSELY UNUSED CLASS FOR MY OWN PURPOSES FOR REFERENCE LATER
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.BorderLayout;

public class DoNotEnterSign extends JPanel {

	//because why not--lets set up a thing to do some graphics
	private static final long serialVersionUID = 7148504528835036003L;
	public void paintCompont(Graphics g)
	{
		super.paintComponent(g);
		
		var center = new Point(getWidth()/2, getHeight()/2);
		var radius = Math.min(getWidth()/2, getHeight()/2)-5;
		var diameter = radius * 2;
		var innerRadius = (int)(radius * 0.9);
		var innerDiameter = innerRadius * 2;
		var barWidth = (int)(innerRadius * 1.4);
		var barHeight = (int)(innerRadius * 0.35);
		
		g.setColor(Color.WHITE);
		g.fillOval(center.x - radius, center.y - radius, diameter, diameter);
		g.setColor(Color.RED);
		g.fillOval(center.x - innerRadius, center.y - innerRadius, innerDiameter, innerDiameter);
		g.setColor(Color.WHITE);
		g.fillRect(center.x - barWidth/2,  center.y-barHeight/2, barWidth, barHeight);
	}
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Do not enter sign");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.add(new DoNotEnterSign());
		frame.setVisible(true);
	}
}
