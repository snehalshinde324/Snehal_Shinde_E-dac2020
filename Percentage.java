import java.util.Scanner;
public class Percentage
{
	public static void main(String[] args)
	{
		int english, maths, physics, chemistry, computer;
		float sum, percentage;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the five subjects marks: ");
		english =sc.nextInt();
		maths =sc.nextInt();
		physics =sc.nextInt();
		chemistry =sc.nextInt();
		computer =sc.nextInt();

		sum = english + maths + physics + chemistry + computer;
		percentage = (sum/500)*100;
		
		System.out.println("percentage marks = "+percentage+"%");
	}
}

		
		