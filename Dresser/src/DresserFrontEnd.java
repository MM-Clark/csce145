/*
 * Written by Michelle Clark
 */
import javax.swing.JOptionPane;

public class DresserFrontEnd 
{
	//main method
	public static void main(String[] args) 
	{
		//declaring run boolean
		boolean run = true;
		//creating the dresser
		Dresser dresser = new Dresser();
		//creating the mutable copy for the user to input
		Clothing clothingObjEnter = new Clothing();
		
		do
		{
			String choiceString =
			JOptionPane.showInputDialog("Welcome to the dresser!\nEnter 1: to "
					+ "add an item or to remove an item\nEnter 3: to print out "
					+ "the dresser contents\nEnter 9: to quit");
			int choice = Integer.parseInt(choiceString);
			//Using a switch statement to for cases 1, 3, 9
			//This is like using a ton of if-statements but cleaner
			switch(choice)
			{
				//ADD & REMOVE
				case 1:
				String type =
				JOptionPane.showInputDialog("Enter the type\nIt may be "
						+ "undergarment, socks, stockings, top, bottom, or cape");
			
				String color = 
				JOptionPane.showInputDialog("Enter the color\nIt may be "
						+ " brown, pink, orange, green, blue, purple, or grey");
				
				clothingObjEnter.setType(type);
				clothingObjEnter.setColor(color);
				
				Clothing clothingObj = clothingObjEnter;
				
				String addOrRemove =
				JOptionPane.showInputDialog("Would you like to add (type 'a') or remove (type 'r') the item?");
				
				if(addOrRemove.equalsIgnoreCase("a"))
				{
					dresser.add(clothingObj);
				}
				
				if(addOrRemove.equalsIgnoreCase("r"))
				{
					dresser.remove(clothingObj);
				}
				dresser.print();
				break;
			
				//PRINT
				case 3:
				System.out.println("Print chosen");
				dresser.print();
				break;
			
				//QUIT
				case 9:
				run = false;
				break;
				
				default:
				System.out.println("Invalid input");
				break;
			}
		}while(run == true);
		JOptionPane.showMessageDialog(null,"Shutting down mates!");
		System.exit(0);
	}
}
//UI CHOICE TO CREATE CLOTHING THEN ADD REMOVE --> MORE EFFICIENT
