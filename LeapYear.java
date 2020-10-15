import java.util.Scanner;
public class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the any year: ");
		int year=sc.nextInt();
		if(year%400==0 || (year%4==0 && year%100!=0))
		{
			System.out.println(year+" is a leap year.");
		}
		else
		{
			System.out.println(year+" is not a leap year.");
		}
	}
}

/*

import java.util.Scanner;
public class LeapYear
{
	static void LeaporNot(int year)
	{	
		if(year%400==0 || (year%4==0 && year%100!=0))
		{
			System.out.println(year+" is a leap year.");
		}
		else
		{
			System.out.println(year+" is not a leap year.");
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the any year: ");
		int year=sc.nextInt();
		LeaporNot(year);
	}
} */
		