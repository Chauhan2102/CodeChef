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
		int count = 0;
		
		for (int i=1; i<=4; i++) {
		    int a = sc.nextInt();
		    if (a>=10){
		        count++;
		    }
		} 
		System.out.print(count);
		
	}
}