import java.util.Scanner;
public class EmployeeSalary
{
	public static void main(String args[])
	{
		int basic,hra,da,gross;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Employee's Salary: ");
		basic=sc.nextInt();
		if(basic<10000)
		{
			hra= (basic*10)/100;
			da= (basic*90)/100;
			gross=(basic+hra+da);
			System.out.println("Employee's Gross Salary: "+gross);
		}
		else
		{
			hra= 2000;
			da= (basic*98)/100;
			gross=(basic+hra+da);
			System.out.println("Employee's Gross Salary: "+gross);
		}
	}
}