/*1. Write a program to merge two arrays of integers by reading one number at a      time from each array until one of the array is exhausted, and then           concatenating the remaining numbers.
     Input: [23,60,94,3,102] and [42,16,74]
     Output: [23,42,60,16,94,74,3,102]
*/

import java.util.Scanner;
class Question1
{
    public static void main(String [] args)
    {
        int i;
        int arr[]=new int[]{23,60,94,3,102};
        int arr1[]=new int[]{42,16,74};
                
        for(i=0;i<5;i++)
        {
            if(i<3)
            System.out.print(arr[i]+" "+arr1[i]+" ");
            else
                System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}