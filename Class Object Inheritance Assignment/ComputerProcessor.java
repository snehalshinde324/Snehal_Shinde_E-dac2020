//9. Create an Abstract class Processor with int member variable data  and method showData to display data value. Create abstract method process() to define processing of member data.
//   Create a class  Factorial using abstract class Processor  to calculate and print factorial of a number by overriding the process method. 
//   b. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method.
//   Ask user to enter choice (factorial or circle area).  Also ask data to work upon. Use Processor class reference to achieve this mechanism.


import java.util.*;
import java.lang.Math;
abstract class Processor{
	double data;
	void showData() {
		System.out.println("Data := "+this.data);
	}
	abstract void process(int n); 
}
class  Factorial extends Processor{
	void process(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		data=fact;
	}
}


class Circle extends Processor{
	void process(int n) {
	final float PI=3.14f;	
	double area=PI*n*n;
	data=area;
	}
} 
public class ComputerProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Factroial of number \n 2.Area of Circle ");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:Factorial ob=new Factorial();
					System.out.println("Enter the number whose Factorial is to be find := ");
						int n=sc.nextInt();
						ob.process(n);
						ob.showData();
						break;
			case 2:	Circle ob1=new Circle();
					System.out.println("Enter the Circle whose Area is to be find := ");
							int r=sc.nextInt();
								ob1.process(r);
								ob1.showData();
								break;
			default:System.out.println("Wrong Choice");					
		}
	}
}
