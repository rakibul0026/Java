package mycompany;

public class Staticblock {
String name;
int id;
static String u_name;
Staticblock(String name,int id )
{
	this.name=name;
	this.id=id;
	System.out.println("constructor");
}
}
public Static void main(String[]args) {
	static {
		u_name="Cstu";
		System.out.println("Static Block");
	}
}

