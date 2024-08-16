package Encapsulation;

public class main {
    public static void main(String[] args) {
         student ob=new  student();
         ob.set("ratul");
         ob.setroll(23);
         
         System.out.println("name is :"+ob.get());
         System.out.println("roll is :"+ob.getroll());
    }
 
}

