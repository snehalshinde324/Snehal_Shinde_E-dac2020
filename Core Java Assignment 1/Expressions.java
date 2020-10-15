public class Expressions
{
	public static void main(String[] args)
	{
		long x=10,y=20;
		y = (x*x) + (3*x) - 7;
		System.out.println("y="+y);

		int d=10,f=20;
		f = d++ + ++d;
		System.out.println("x="+d+", y="+f);
		
		int p=10,q=20,r=30;
		r = p++ - --q - --p  +  p++;
		System.out.println("x="+p+", y="+q+", z="+r);

		boolean c,a=true,b=true;
		c = a && b || !(a || b);
		System.out.println("z="+c);

	}
}