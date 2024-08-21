


package mycompany;

public class Staticblock2 {
String name;
int id;
static String u_name;
Staticblock()
{
	
	System.out.println("constructor");
}
}
public Static void main(String[]args) {
	static {
		u_name="Cstu";
		System.out.println("Static Block");
	}
}

