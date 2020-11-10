//8.	Create three classes
//   	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print salary.
//  	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
//  	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )

import java.util.*;
import java.lang.Math;
class Faculty{
	int facultyId;
	double salary;
	void input(int facultyId) {
		this.facultyId=facultyId;
	}
	
	void printSalary() {
		System.out.println("Salary is  := "+this.salary);
	}
}

class FullTimeFaculty extends Faculty{
	int basicSalary;
	int allowance;
	void input(int facultyId) {
		this.facultyId=facultyId;
	}
	void input(int facultyId,int basicSalary,int allowance)
    {
        super.input(facultyId);
        this.basicSalary=basicSalary;
        this.allowance=allowance;
        super.salary=basicSalary + allowance;
    }
}

class PartTimeFaculty extends Faculty{
	int workingHours;
	int ratePerHour;
	void input(int facultyId) {
		this.facultyId=facultyId;
	}
	void input(int id,int workingHours,int ratePerHour)
    {
        super.input(facultyId);
        this.workingHours=workingHours;
        this.ratePerHour=ratePerHour;
        super.salary=this.workingHours * this.ratePerHour;
    }
	
}


public class CollegeFacultyData {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("For Full Time Faculty");
		System.out.print("Enter Faculty id := ");
		int facultyId=sc.nextInt();
		System.out.print("Enter Faculty basic Salary := ");
		int basicSalary=sc.nextInt();
		System.out.print("Enter Faculty Allowance := ");
		int allowance=sc.nextInt();
		
		FullTimeFaculty ob=new FullTimeFaculty();
		ob.input(facultyId, basicSalary, allowance);
		
		
		System.out.println("For Part Time Faculty");
		System.out.print("Enter Faculty id := ");
		int facultyId1=sc.nextInt();
		System.out.print("Enter Faculty Working Hours := ");
		int workingHours=sc.nextInt();
		System.out.print("Enter Faculty ratePerHour := ");
		int ratePerHour=sc.nextInt();
		
		PartTimeFaculty ob2=new PartTimeFaculty();
		ob2.input(facultyId1, workingHours, ratePerHour);
		
		ob.printSalary();
		ob2.printSalary();
	}
}

