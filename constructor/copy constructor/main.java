package copyconstructor;
public class main {
    public static void main(String[] args) {
        AB ob=new AB("ratul",1026);
        System.out.println("name is "+ob.name);
        System.out.println("id is :"+ob.id);
        
        
        
        AB ob2=new AB(ob);
        System.out.println("After copy constructor :"+ob2.name);
        System.out.println("After copy constructor :"+ob2.id);
        
    }
}

