package datastructure;

//Fibonacci Series using Recursion 
class fibonacciSeries 
{ 
	static int fib(int n) 
	{ 
	if (n <= 1) 
	return n; 
	return fib(n-1) + fib(n-2); 
	} 
	
	public static void main (String args[]) 
	{ 
	int n = 9; 
	System.out.println(fib(n)); 
	} 
} 

/*
//Using  For Iteration
public class FibonacciSeries {

	public static void main(String[] args) 
	{
		// Set it to the number of elements you want in the Fibonacci Series
		 int maxNumber = 10; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	           
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
	}
}
*/