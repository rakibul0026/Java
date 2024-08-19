
package inheritance;

interface A {
   abstract void display();
}

interface B {
   abstract void print();
    
}


class M implements A,B{
    @Override
   public  void display(){
        System.out.println("CSTU");   
    }
    @Override
    public void print(){
        System.out.println("CSE");
    }
}
