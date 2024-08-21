package package2;

public  abstract class Animal 
 {
public  abstract void display();
public void sleep()
  {
	System.out.println("Cat");
 }
  }
class A extends Animal {
	public void display()
	  {
		System.out.println("tiger");
	 }
}
