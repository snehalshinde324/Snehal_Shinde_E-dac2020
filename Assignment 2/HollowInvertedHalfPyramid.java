import java.util.Scanner;
public class HollowInvertedHalfPyramid
{
    public static void main(String[] args)
    {
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
	int i=n;
	int j;
	while(i>0)
               {
	     if(i==1 || i==n)
           	     {
             	           j=1;
             	           while(j <=i)
                           {
     	                       System.out.print("* ");
     	                        j++;
    	             }
   	        }
                   else
	     {
                      j=1;
                      while(j<=i)
                      {
                           if(j==1 || j==i)
                             	     System.out.print("* ");
                            else
                                   System.out.print("  ");
	            j++;
                      }
                     }
                   System.out.println();
                     i--;
               }             
    }
}