//6. Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
//   Create a main method in different class (say ProductDemo) and perform following task:
//   a. Accept information for five Product objects from user and store objects in an array
//   b. Find pid of product with highest price. 
//   c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products.
//  (amount spent on single product = price of product * quantity of product )


import java.util.*;
import java.lang.Math;
class Product{
	
	int pid;
	double price;
	int quantity;
	
	public Product(int pid, double price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	static void productWithHighestPrice(Product[] p) {
		double max=p[0].price;
		for (int i = 0; i < p.length; i++) {
			if(p[i].price>max)max=p[i].price;
		}
		System.out.println();
		System.out.println("Maximum price is := "+max);
		
		System.out.println();
		for (int i = 0; i < p.length; i++) {
			if(p[i].price==max) {
				System.out.println("The Pid of Highest price is := "+p[i].pid);
			}
		}
		
	}
	
	
	static double[] moneySpentOn(Product[] arr) {
		
		double[] sum =new double[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			sum[i]=(arr[i].price * arr[i].quantity);
		}
		return sum;
		
	}

	
}
public class ProductOfStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Product[] arr=new Product[5];
		
		for (int i = 0; i < arr.length; i++) {
		
			System.out.print("Enter Product Id := ");
			int pid=sc.nextInt();
			System.out.print("Enter the Price := ");
			double price=sc.nextDouble();
			System.out.print("Enter the Quantities :=");
			int quantity=sc.nextInt();
			
			arr[i]=new Product(pid,price,quantity);
		}
		
		Product.productWithHighestPrice(arr);
		double[] spent=Product.moneySpentOn(arr);
	System.out.println();
		for (int i = 0; i < spent.length; i++) {
			System.out.println(arr[i]+"  spent on each item := "+spent[i]);
		}
	}
}



