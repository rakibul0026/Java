package constructor.newpackage;
public class main {
    public static void main(String[] args) {
         Example ob=new Example("ratul",12);
         System.out.println("name :"+ob.name);
         System.out.println("id :"+ob.id);
         
         
          Example ob2=new  Example(ob);
          System.out.println("");
          System.out.println("After use copy constructor : "+ob2.name);
          System.out.println("after use copy constructor is :"+ob2.id);
         
         
         
    }
    
}

