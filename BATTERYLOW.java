/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class BatteryLow {
    String Notification(int num) {
        if(num>15) return "No";
        else return "Yes";
    }
}
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0) {
		    int n = scan.nextInt();
		    System.out.println(new BatteryLow().Notification(n));
		}
		scan.close();
	}
}
