
package Demo.abstraction;

public   abstract class A {
     abstract void print();
     void display(){
         System.out.println(" CSE");
     }
    
}
class B extends A{
void print()  {
    System.out.println("cstu");
}  
}
