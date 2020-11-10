//4. Given an array of integers, print whether the numbers are in
//   ascending order or in descending order or in random order without sorting.
//   Input: [5,14,35,90,139] Output: Ascending
//   Input: [88,67,35,14,-12] Output: Descending
//   Input: [65,14,129,34,7] Output: Random

import java.util.Scanner;
class Question4
{
    public static void main(String [] args)
    {
        int i,j,Asc=0,Desc=0;
        Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[5];
        
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
                
        for(i=0;i<4;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(arr[i]<arr[j])
                    Asc++;
                else if(arr[i]>arr[j])
                    Desc++;
            }
        }
        
        if(Asc==10)
            System.out.println("Ascending");
        else if(Desc==10)
            System.out.println("Descending");
        else
            System.out.println("Random");
    }
}

