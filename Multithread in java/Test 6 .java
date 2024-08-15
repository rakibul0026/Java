
package multiThread;
public class Test6 {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Dipta t1=new Dipta();//thread class ar object
        //System.out.println(t1.isAlive());
        t1.start(); //create thread class
        System.out.println(t1.isAlive());
 System.out.println("Main Thread ended and x="+t1.x);
        
    }
}
class Dipta extends Thread{
    int x;
    public void run(){
        for(int i=0;i<10000;i++){
            x++;
            
        }
      System.out.println("Main Thread ended and x="+x);
    }
    
}
