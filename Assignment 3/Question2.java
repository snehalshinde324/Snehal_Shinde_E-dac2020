/*2. Write a program which takes an array of integers and prints the running average of
   3 consecutive integers. In case the array has fewer than 3 integers, there should be no output.
   Input: [5,14,35,89,140]
   Output: [18, 46, 88]
   (Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)
*/

import java.util.Scanner;
class Question2
{
    public static void main(String [] args)
    {
        int i,j,sum=0,avg=0;
        int arr[]=new int[]{5,14,35,89,140};
                
        for(i=0;i<5;i++)
        {
            if(i<3)
            {
                sum=arr[i]+arr[i+1]+arr[i+2];
                avg=sum/3;
                System.out.print(avg+" ");
            }
        }
        System.out.println();
    }
}
