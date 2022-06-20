/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Burgers {
    public static int PossibleBurger(int patty , int bun) {
        return ((patty>=bun ? bun:patty));
    }
}
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
		    int patty = scan.nextInt();
		    int bun = scan.nextInt();
		    System.out.println(Burgers.PossibleBurger(patty,bun));
		}
	}
}
