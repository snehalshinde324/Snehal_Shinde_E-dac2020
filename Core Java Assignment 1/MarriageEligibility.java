import java.util.Scanner;
public class MarriageEligibility
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your gender (M/F): ");
		char g= sc.nextLine().charAt(0);
		System.out.print("Enter your age: ");
		int a= sc.nextInt();
		
		if (g=='F')
		{
			if (a>=19)
			{
				System.out.println("You are eligible for marriage.");
			}
			else
			{
				System.out.println("You are not eligible for marriage.");
			}
		}
		else
		{
			if (a>=21)
			{
				System.out.println("You are eligible for marriage.");
			}
			else
			{
				System.out.println("You are not eligible for marriage.");
			}
		}
	}
}

		