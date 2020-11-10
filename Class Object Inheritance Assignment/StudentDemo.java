
/*Que.1
	Create a class Student with 2 data members rollno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rollno and name. Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.
*/


//import java.util.Scanner;
class Student
{
	int rollNo;
	String name;

	void setData(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}

	void showData()
	{
		System.out.println("Student RollNo.: "+rollNo);
		System.out.println("Student Name: "+name);
	}
}

class StudentDemo
{
	public static void main(String args[])
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student RollNo: ");
		int rollNo= sc.nextInt();
		System.out.print("Enter Student Name: ");
		String name= sc.next();
		*/
		Student s = new Student();
		s.setData(103,"Snehal");
		s.showData();

	}
}
	



	