/*
4.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
	a. two integers 
	b. three floats 
	c. all elements of array 
	d. one double and one integer 
*/

import java.util.Scanner;

class MathOperation
{
	int a;
	int b;
	float f1;
	float f2;
	float f3;
	double d;
	int e;
	//int arr[];
	
	void multiply(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Multiplication of two integers: "+(a*b));
	}

	void multiply(float f1, float f2, float f3)
	{
		this.f1=f1;
		this.f2=f2;
		this.f3=f3;
		System.out.println("Multiplication of three floats: "+(f1*f2*f3));
	}

	void multiply(int arr[])
	{	
		int multi = 1;
		for( int num : arr) 
		{
         	 	multi = multi*num;
      		}
      		System.out.println("Multiplication of array elements is: "+multi);
	}

	void multiply(double d, int e)
	{
		this.d=d;
		this.e=e;
		System.out.println("Multiplication of one double and one integer: "+(double)(d*e));
	}
	
}

class MathDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("Enter three float number: ");
		float f1 = sc.nextFloat();
		float f2 = sc.nextFloat();
		float f3 = sc.nextFloat();
		System.out.print("Enter one double and one integer: ");
		double d = sc.nextDouble();
		int e = sc.nextInt();
		System.out.print("Enter an array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		
		}	
		MathOperation math = new MathOperation();
		math.multiply(a,b);
		math.multiply(f1,f2,f3);
		math.multiply(arr[]);
		math.multiply(d,e);
		
	}
}
		
