import java.util.Scanner;
public class Temperature
{
	public static void main(String args[])
	{		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Tepmerature in Fahrenheit: ");
		double f=sc.nextInt();		
		double c= 5*(f-32)/9 ; 
		System.out.print("Tepmerature in Celsius: "+c);
	}
}