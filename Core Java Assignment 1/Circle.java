import java.util.Scanner;
public class Circle
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		double r=sc.nextDouble();
		double a= Math.PI*(r*r);
		System.out.println("Area of Circle: "+a);
		double c= Math.PI*(2*r);
		System.out.println("Circumference of Circle: "+c);
	}
}