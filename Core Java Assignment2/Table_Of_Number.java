import java.util.Scanner;
public class Table_Of_Number
{
	public static void main(String args[])
	{	int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number: ");
		int n = sc.nextInt();
		
		for(i=1;i<=10;i++)
		{		
			int a=(n*i);
			System.out.println(n+"x"+i+"="+a);
		}
		System.out.println();
	}
}