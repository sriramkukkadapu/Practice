
public class CoinsProblem_geeksforgeeks {
public static void main(String args[])
{

    int coins[] = {9, 6, 5, 1,3};
    int m = coins.length;
    int V = 8;
    System.out.println ( "Minimum coins required is "
                        + minCoins(coins, m, V));
}


//m is size of coins array 
// (number of different coins)
static int minCoins(int coins[], int m, int V)
{
    // table[i] will be storing 
    // the minimum number of coins
    // required for i value. So 
    // table[V] will have result
    int table[] = new int[V + 1];

    // Base case (If given value V is 0)
    table[0] = 0;

    // Initialize all table values as Infinite
    for (int i = 1; i <= V; i++)
    table[i] = Integer.MAX_VALUE;

    printArray(table);
    
    System.out.println("Logic");
    // Compute minimum coins required for all
    // values from 1 to V
    for (int i = 1; i <= V; i++)
    {
        // Go through all coins smaller than i
        for (int j = 0; j < m; j++)
        if (coins[j] <= i)
        {
            int sub_res = table[i - coins[j]];
            if (sub_res != Integer.MAX_VALUE 
            		&& sub_res + 1 < table[i])
                   table[i] = sub_res + 1; 
        		
            printArray(table);
        }
       
        System.out.println("After iteration: "+i);
       printArray(table);
    }
    return table[V];
     
}

public static void printArray(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println("");
}
public static boolean existsInArray(int ele,int a[])
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==ele)
			return true;
	}
	return false;
}
}
