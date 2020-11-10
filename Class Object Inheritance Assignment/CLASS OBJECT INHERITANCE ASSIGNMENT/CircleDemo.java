/*Que.2
	Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of radius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.
*/


import java.util.Scanner;
class Circle
{
	double radius;
	double area;
	
	void init(double radius)
	{
		this.radius = radius;		
	}
	
	void calculateArea()
	{			
		area = 3.14*radius*radius;		
	}

	void display()
	{
		System.out.println("Radius of Circle: "+radius);
		System.out.println("Area of Circle: "+area);
	}
}

class CircleDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		float radius = sc.nextFloat();

		Circle c = new Circle();
		c.init(radius);
		c.calculateArea();
		c.display();
	}
}