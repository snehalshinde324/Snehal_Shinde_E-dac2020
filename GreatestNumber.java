import java.util.Scanner;
public class GreatestNumber
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		if(a>b && a>c)
		{
			System.out.print("Greatest number is "+a);
		}
		else if(b>a && b>c)
		{
			System.out.print("Greatest number is "+b);
		}
		else
		{
			System.out.print("Greatest number is "+c);
		}
	}
}

/* 
import java.util.Scanner;
public class GreatestNumber
{
	public static void main(String args[])
	{
		int a,b,c,d,result;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		d=a>b ? a:b;
		result=	c>d ? c:d;
		System.out.print("Greatest number is "+result);
	}
}*/
	