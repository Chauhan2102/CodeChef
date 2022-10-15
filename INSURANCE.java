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
		    int maxRebated = sc.nextInt();
		    int reqAmount = sc.nextInt();
		    
		    if (reqAmount <= maxRebated){
		        System.out.println(reqAmount);
		    }
		    else {
		        System.out.println(maxRebated);
		    }
		} 
	}
}
