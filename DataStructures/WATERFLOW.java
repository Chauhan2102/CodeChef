/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		
		for (int i=1; i<=testcases ;i++ ) {
		    int water = sc.nextInt();
		    int maxCapacity = sc.nextInt();
		    int addedWater = sc.nextInt();
		    int perHour = sc.nextInt();
		    int total = water + addedWater * perHour;
		    
		    if (total > maxCapacity) {
		        System.out.println("OVERFLOW");
		    }
		    else if (total == maxCapacity) {
		        System.out.println("FILLED");
		    }
		    else {
		        System.out.println("UNFILLED");
		    }
		} 
	}
}
