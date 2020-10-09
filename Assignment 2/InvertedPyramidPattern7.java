import java.util.Scanner; 
public class InvertedPyramidPattern7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the rows you want");
		int rows=sc.nextInt();
		System.out.println("");
		for (int i=rows; i>=1; i--)
		{
  			for (int j=0; j<=rows-i; j++)
			{
  				System.out.print(" ");
 			}
 			int count=0;
			while(count != i)
			{
  				System.out.print(i+" ");  
			count++;  
			}                                               
		System.out.println();
		}
                                                   
	}
}