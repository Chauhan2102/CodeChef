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
		int test = sc.nextInt();
		while((test--)>0){
		    int count = 0;
		    int totalNumberProb = sc.nextInt();
		    while((totalNumberProb--)>0){
		    int difficultyRating = sc.nextInt();
		    if(difficultyRating>=1000)
		        count++;
		    }
		    System.out.println(count);
		}
	}
}