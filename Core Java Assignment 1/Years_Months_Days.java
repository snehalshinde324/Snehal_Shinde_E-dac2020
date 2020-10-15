import java.util.Scanner;
public class Years_Months_Days
{
	public static void main(String args[])
	{
		int y,m,d;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no. days: ");
		int n=sc.nextInt();
		
		y = n / 365;
		n = n % 365;
		System.out.println("No. of Years: "+y);

		m = n / 30;
		n= n % 30;
		System.out.println("No. of Months: "+m);

		d = n;
		System.out.println("No. of Days: "+d);
		
	}
}
		
		
	