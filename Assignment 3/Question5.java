/*5. Write a function which accepts an floating point number and counts the number of decimal
   places in the number without using a string.
   Input: 45.286 Output: 3
   Input: 3.14159 Output: 5
*/

import java.util.Scanner;
class Question5
{
    public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any floting number");
		float x =sc.nextFloat(); 
		sc.close();
        int count=0;
        do
    	{
    	    x =x*10;
    		count++ ;
    	} 
        while(x != (int)x);
	System.out.println("Digits after decimal are: "+count);
	} 
}
