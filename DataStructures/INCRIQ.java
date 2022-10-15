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
		int einsteinIq = 170;
		Scanner sc = new Scanner(System.in);
		int chefIq = sc.nextInt();
		int musicalInstruement = 7;
		
		if (chefIq + musicalInstruement > einsteinIq){
		    System.out.println("YES");
		}
		else {
		    System.out.println("NO");
		}
	}
}
