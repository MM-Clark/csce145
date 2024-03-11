/*
 * Written by M.M.Clark
 */

//Time Complexity: O(2^n)
//Auxiliary Space: O(n)

public class TowerOfHanoi {
	//Java recursive func to solve 
	static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod)
	{
		if(n==1)
		{
			System.out.println("Move disk 1 from rod "+ fromRod + " to rod "+ toRod);
			return;
		}
		towerOfHanoi(n-1, fromRod, auxRod, toRod);
		System.out.println("Move disk "+n+" from rod "+ fromRod+" to rod "+toRod);
		towerOfHanoi(n-1, auxRod, toRod, fromRod);
	}
	//Driver method
	public static void main(String[] args) 
	{
		int n = 4; //Number of disks
		towerOfHanoi(n, 'A', 'C', 'B'); //a, b, c are disks
	}

}
