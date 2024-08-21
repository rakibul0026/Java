/* Write a Java program to create an abstract class Employee with abstract 
methods calculateSalary() and displayInfo(). Create subclasses Manager and 
Programmer that extend the Employee class and implement the respective 
methods to calculate salary and display information for each role.*/

package w3problem3;

public  abstract class Employee {
	String name ;
	double baseSalary;
	 void display1()
	 {
		 System.out.println("name is :"+name);
		 System.out.println("baseSalary is :"+baseSalary);
	 }
	 
	public  abstract void calculateSalary();
	public  abstract void displayInfo();
}
class Manager extends Employee
{
	String department ;
	void salary() 
	{
		display1();
		System.out.println("department is :"+department+"\n");
	}
}
class Programmer extends Employee
{
	double  hourlyRate;
	void display() 
	{
		display1();
		System.out.println("hourlyRate is :"+hourlyRate);
	
	}
}
