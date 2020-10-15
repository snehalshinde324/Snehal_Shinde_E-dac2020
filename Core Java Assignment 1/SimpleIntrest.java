import java.util.Scanner;
public class SimpleIntrest
{
	public static void main(String[] args)
	{
		float p,r,t,sintrest;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Principal Amount= ");
		p=sc.nextFloat();
		System.out.println("Enter Rate of Intrest= ");
		r=sc.nextFloat();
		System.out.println("Enter Time= ");
		t=sc.nextFloat();
		sc.close();
		sintrest= p*r*t/100;
		System.out.println("Simple Intrest= "+sintrest);
	}
}