package javaprogram;

public class Vehicle {
	String color;
	String name;
	Vehicle(String color,String name){
		this.color=color;
		this.name=name;	
	}
	void display() {
		System.out.println(color +" \n"+name);
	}

}
class Bike extends Vehicle {
	int bikeno;
	Bike(String color,String name,int bikeno){
		super(color ,name);
		this.bikeno=bikeno;
	}
	

 void display2(){
	super.display();
	System.out.println(bikeno);
 }
 }


