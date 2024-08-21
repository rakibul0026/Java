package w3problem3;

public class Test {

	public static void main(String[] args) {
		Manager ob1= new Manager();
		ob1.name="rakibul";
		ob1.baseSalary=2000;
		ob1.department="cse";
		
		ob1.salary() ;
		
		Programmer ob2= new Programmer();
		ob2.name="ratul";
		ob2.baseSalary=2000;
		ob2.hourlyRate=3;
		//ob2.display1();
		ob2.display() ;


	}

}

