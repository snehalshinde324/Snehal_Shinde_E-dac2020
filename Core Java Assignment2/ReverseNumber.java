import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int reversed=0;
		
		while(num!=0)
		{
			int d= num%10;
			reversed= reversed*10 +d;
			num/=10;	
		}
		System.out.println("Reversed Number: "+reversed);
	}
}
		
		