/*
 * Written by Michelle Clark
 */
public class Dresser 
{
	//declaring multidimensional array for dresser titled clothes
	private Clothing[][] clothes;
	
	public Dresser()
	{
		this.clothes = new Clothing[5][2];
	}
	
	public void add(Clothing clothingObj)
	{
		//declaring a defensive copy of clothing to set to clothingObj's characteristics
		Clothing clothingAdd = new Clothing();
		clothingAdd.setType(clothingObj.getType());
		clothingAdd.setColor(clothingObj.getColor());
		
		//sort by type into drawers
		if(clothingAdd.getType().equalsIgnoreCase("Undergarment"))
		{
			//Undergarments are in drawer 0 so that's why I use it after finding the type
			//I check 1 because that's the length of the array minus 1 (2-1=1)
			if(clothes[0][1]!=null)
			{
				System.out.println("The undergarment drawer is full!");
				return;
			}
			//The program adds the undergarment to the first null index of [0][j]
			for(int i=0;i<2;i++)
			{
				if(clothes[0][i]==null)
				{
					clothes[0][i]=clothingAdd;
					break;
				}
			}
		}
		
		if(clothingAdd.getType().equalsIgnoreCase("Socks")||clothingAdd.getType().
				equalsIgnoreCase("Stockings"))
		{
			if(clothes[1][1]!=null)
			{
				System.out.println("The socks/stockings drawer is full");
				return;
			}
			
			for(int i=0;i<2;i++)
			{
				if(clothes[1][i]==null)
				{
					clothes[1][i]=clothingAdd;
					break;
				}
			}
		}
		
		if(clothingAdd.getType().equalsIgnoreCase("Top"))
		{
			if(clothes[2][1]!=null)
			{
				System.out.println("Top drawer is full");
				return;
			}
			
			for(int i=0;i<2;i++)
			{
				if(clothes[2][i]==null)
				{
					clothes[2][i]=clothingAdd;
					break;
				}
			}
		}
		
		if(clothingObj.getType().equalsIgnoreCase("Bottom"))
		{
			if(clothes[3][1]!=null)
			{
				System.out.println("The bottoms drawer is full!");
				return;
			}
			for(int i=0;i<2;i++)
			{
				if(clothes[3][i]==null)
				{
					clothes[3][i]=clothingAdd;
					break;
				}
			}
		}
		
		if(clothingObj.getType().equalsIgnoreCase("Cape"))
		{
			if(clothes[4][1]!=null)
			{
				System.out.println("Cape drawer is full");
				return;
			}
			
			for(int i=0;i<2;i++)
			{
				if(clothes[4][i]==null)
				{
					clothes[4][i]=clothingAdd;
					break;
				}
			}
		}
	}
	
	public void remove(Clothing clothingObj)
	{
		Clothing clothingRemove = new Clothing();
		clothingRemove.setType(clothingObj.getType());
		clothingRemove.setColor(clothingObj.getColor());
		//find the drawer by type
		if(clothingRemove.getType().equalsIgnoreCase("Undergarment"))
		{
			//initialize remove index to an invalid value
			int removeIndexU = -1;
			
			for(int j=0;j<2;j++)
			{
				if(clothes[0][j]!=null&&clothingRemove.getColor().equalsIgnoreCase(clothes[0][j].getColor()))
				{
					removeIndexU = j;
					break;
				}
			}
			if(removeIndexU == -1)
			{
				System.out.println("The undergarment to remove wasn't found");
			}
			//clothing to remove found so shift everything left by one
			//it is j+1 even though it is counter-intuitive because yeah
			//note how j<1 which is length-1 rather than length like above
			else
			{
				for(int j = removeIndexU;j<1;j++)
				{
					clothes[0][j]=clothes[0][j+1];
				}
				//ensure last index always null
				clothes[0][1]=null;
			}
		}
		if(clothingRemove.getType().equalsIgnoreCase("Socks")||
				clothingRemove.getType().equalsIgnoreCase("Stockings"))
		{
			//initialize remove index to an invalid value
			int removeIndexS = -1;
			
			for(int j=0;j<2;j++)
			{
				if(clothes[1][j]!=null&&clothingRemove.getColor().equalsIgnoreCase(clothes[1][j].getColor()))
				{
					removeIndexS = j;
					break;
				}
			}
			if(removeIndexS == -1)
			{
				System.out.println("The socks or stockings to remove weren't found");
			}
			//clothing to remove found so shift everything left by one
			else
			{
				for(int j = removeIndexS;j<1;j++)
				{
					clothes[1][j]=clothes[1][j+1];
				}
				//ensure last index always null
				clothes[1][1]=null;
			}
		}
		if(clothingRemove.getType().equalsIgnoreCase("Top"))
		{
			//initialize remove index to an invalid value
			int removeIndexT = -1;
			
			for(int j=0;j<2;j++)
			{
				if(clothes[2][j]!=null&&clothingRemove.getColor().equalsIgnoreCase(clothes[2][j].getColor()))
				{
					removeIndexT = j;
					break;
				}
			}
			if(removeIndexT == -1)
			{
				System.out.println("The top to remove wasn't found");
			}
			//clothing to remove found so shift everything left by one
			else
			{
				for(int j = removeIndexT;j<1;j++)
				{
					clothes[2][j]=clothes[2][j+1];
				}
				//ensure last index always null
				clothes[2][1]=null;
			}
		}
		if(clothingRemove.getType().equalsIgnoreCase("Bottom"))
		{
			//initialize remove index to an invalid value
			int removeIndexB = -1;
			
			for(int j=0;j<2;j++)
			{
				if(clothes[3][j]!=null&&clothingRemove.getColor().equalsIgnoreCase(clothes[3][j].getColor()))
				{
					removeIndexB = j;
					break;
				}
			}
			if(removeIndexB == -1)
			{
				System.out.println("The bottom to remove wasn't found");
			}
			//clothing to remove found so shift everything left by one
			else
			{
				for(int j = removeIndexB;j<1;j++)
				{
					clothes[3][j]=clothes[3][j+1];
				}
				//ensure last index always null
				clothes[3][1]=null;
			}
		}
		if(clothingRemove.getType().equalsIgnoreCase("Cape"))
		{
			//initialize remove index to an invalid value
			int removeIndexC = -1;
			
			for(int j=0;j<2;j++)
			{
				if(clothes[4][j]!=null&&clothingRemove.getColor().equalsIgnoreCase(clothes[4][j].getColor()))
				{
					removeIndexC = j;
					break;
				}
			}
			if(removeIndexC == -1)
			{
				System.out.println("The cape to remove wasn't found");
			}
			//clothing to remove found so shift everything left by one
			else
			{
				for(int j = removeIndexC;j<1;j++)
				{
					clothes[4][j]=clothes[4][j+1];
				}
				//ensure last index always null
				clothes[4][1]=null;
			}
		}
	}
	
	public void print()
	{
		//I use 5 instead of the length to make it faster because less computation 
		//involved
		for(int i=0;i<5;i++)
		{
			System.out.print("Drawer "+i+"\n");
			for(int j = 0;j<2;j++)
			{
				if(clothes[i][j]!=null)
				{
					System.out.println(clothes[i][j].toString());
				}
			}
			System.out.println();
		}
	}
}