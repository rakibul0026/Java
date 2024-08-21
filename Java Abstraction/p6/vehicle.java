package newpora;

public abstract class Vehicle {
	
	//Car and Motorcycle that extend
	abstract  void startEngine();
	abstract  void stopEngine();
}
class Car extends Vehicle{
	void startEngine() {
	System.out.println("car start");	
	}
	void stopEngine() {
		System.out.println("car start");	
		}
}
class Motorcycle extends Vehicle{
	void startEngine() {
	System.out.println("Motorcycle start");	
	}
	void stopEngine() {
		System.out.println("Motorcycle start");	
		}
}
