//7. Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default constructor that initializes
//   instance variables with some values and a parameterized constructor that takes values for all instance variables and stores them in instance variables.
//   Now create a method named show()  to print OneBHK’s instance variable values.
//   Create another class TwoBHK which has (inherits) all the properties and behaviors of OneBHK and a new instance variable room2Area.
//   Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all
//   instance variables. Override show() method to print all data member information.
//   Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. Also print total amount of all flats. 

import java.util.*;
import java.lang.Math;
class OneBHK{
	int roomArea;
	int hallArea;
	int price;
	
	public OneBHK() {
		this.roomArea=10;
		this.hallArea=10;
		this.price=1000;
	}
	
	public OneBHK(int roomArea, int hallArea, int price) {
	
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	
	void show() {
		System.out.println("Room Area := "+this.roomArea+"  Hall Area := "+this.hallArea+"  Price := "+this.price);
	}
	
}

class TwoBHK extends OneBHK{
	
	int room2Area;
	public TwoBHK(){
		super();
		this.room2Area=10;
	}
	public TwoBHK(int roomArea, int room2Area,int hallArea,int price) {
		super(roomArea,hallArea,price);
		this.room2Area = room2Area;
	}
	
	void show() {
		System.out.println("Room  1 Area := "+this.roomArea+"  Room 2 Area := "+this.room2Area+"  Hall Area := "+this.hallArea+"  Price := "+this.price);
	}
	
	 static void totalAmountOfFlates(TwoBHK ob1,TwoBHK ob2,TwoBHK ob3) {
		int total=ob1.price+ob2.price+ob3.price	;
		System.out.println("Total Price is := "+total);
				}
}

public class ConstructionPropertiesPVTLTD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoBHK ob1=new TwoBHK(100,100,100,1000);
		TwoBHK ob2=new TwoBHK(200,200,200,2000);
		TwoBHK ob3=new TwoBHK(300,300,300,3000);
		
		ob1.show();
		ob2.show();
		ob3.show();
		
		TwoBHK.totalAmountOfFlates(ob1, ob2, ob3);
	}
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



