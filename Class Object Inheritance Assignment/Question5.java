//5. Create a class Employee with three data members (empNo, salary and totalSalary) and following features:
//    a. Only parameterized constructor. [Do not overload the constructor]
//    b. totalSalary always represents salary total of all the employees created.
//    c. empNo should be auto incremented.
//    d. display total employees and totalSalary using a method.
//    Create another class EmployeeDemo (main class) that creates some Employee objects and
//    calls Employee method to display no. of employees and total of their salaries.

import java.util.*;
import java.lang.Math;
class Employee
{
    static int empNo=0;
    int salery;
    static int totalSalery=0;
    
    Employee(int sal)
    {
        salery=sal;
        empNo++;
        totalSalery=totalSalery+salery;
    }
    
    static void display()
    {
        System.out.println("\nTotal Employees: "+empNo+"\nTotal Salery of all Employees: "+totalSalery);
    }
    
}

class Question5
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter total Entries: ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Salery of Employee "+(i+1)+": ");
            int s=sc.nextInt();
            Employee emp=new Employee(s);
        }
        
        Employee.display();
    }
}
