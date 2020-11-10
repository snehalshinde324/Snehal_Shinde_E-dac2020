/* 3.	Create a class MathOperation that has four static methods. add() method that takes two integer numbers as parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the product. power() method that takes two integer numbers as parameter and returns the power of first number to second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and prints the return values of every method.
*/

import java.util.Scanner;
class MathOperation
{
	static int add(int num1, int num2)
	{		
		System.out.println("Sum of numbers: "+(num1+num2));
		return (num1+num2);
	}

	static int subtract(int num1, int num2)
	{		
		System.out.println("Difference of numbers: "+(num1-num2));
		return (num1-num2);
	}

	static int multiply(int num1, int num2)
	{
		System.out.println("Product of numbers: "+(num1*num2));
		return (num1*num2);
	}

	static int power(int num1, int num2)
	{		
		System.out.println("Power of first number to second number: "+((int)Math.pow(num1, num2)));
		return ((int)Math.pow(num1, num2));
	}
}

class Demo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two integer numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		MathOperation math = new MathOperation();
		math.add(num1,num2);
		math.subtract(num1,num2);
		math.multiply(num1,num2);
		math.power(num1,num2);
	}
}
		 