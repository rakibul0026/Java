
package Demo.abstraction.interface2;

interface A {
    void display();
    
}
interface B extends A{
    
    void print();
}
class AB implements A,B{

    @Override
    public void display() {
        System.out.println("cse department");
    }

    @Override
    public void print() {
        System.out.println("cstu iftar parti");
    }
    
}
