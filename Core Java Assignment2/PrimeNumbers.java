/*
import java.util.Scanner;
public class PrimeNumbers
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the start number: ");
		int start=sc.nextInt();
		System.out.print("Enter the end number: ");
		int end=sc.nextInt();
		     
		for(int n=start;n<=end;n++)
		{ 	int i,flag=0;
						
  			if(n==0||n==1)
			{  
   				break;  
			}
			else
			{  
				for(i=2;i<=end;i++)
				{      
    					if(n%i==0)
					{      
     					        flag=1;      
     						break;      
    					}      
  				//}      
   				if(flag==0)  
				{ 
					System.out.println(n); 
				}  
				}		
			}
		}
	}
}

*/



import java.util.Scanner;  
public class PrimeNumbers {  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter the first number : ");  
       int start = s.nextInt();  
       System.out.print("Enter the second number : ");  
       int end = s.nextInt();  
       System.out.println("List of prime numbers between " + start + " and " + end);  
       for (int i = start; i <= end; i++) {  
           if (isPrime(i)) {  
               System.out.println(i);  
           }  
       }  
   }  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}  